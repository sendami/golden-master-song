package org.tw;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    public static final String GOLDEN_MASTER_PATH = "./goldenMaster.txt";

    @Test
    public void shouldBeTheSameThanGoldenMaster() throws IOException {
        ByteArrayOutputStream inMemoryStream = new ByteArrayOutputStream();
        PrintStream gamesResults= new PrintStream(inMemoryStream);
        System.setOut(gamesResults);

        Song.printSong();

        File file = new File(GOLDEN_MASTER_PATH);
        assertEquals(readStream(new ByteArrayInputStream(inMemoryStream.toByteArray())), readContent(file));
    }

    public static void main(String [] args) throws FileNotFoundException {
        PrintStream goldenMasterFile = new PrintStream(new FileOutputStream(GOLDEN_MASTER_PATH));
        System.setOut(goldenMasterFile);

        Song.printSong();

        goldenMasterFile.close();
    }

    private static List<String> readContent(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return readStream(fileInputStream);
    }

    private static List<String> readStream(InputStream byteArrayInputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        List<String> result= new ArrayList<>();
        while(reader.ready()) {
            result.add(reader.readLine());
        }
        return result;
    }

}
