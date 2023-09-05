package org.tw;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Add a first test that compares the code implemented with
    @Test
    public void shouldMatchGoldenMaster() throws IOException {
        ByteArrayOutputStream inMemoryStream = new ByteArrayOutputStream();
        PrintStream printStream= new PrintStream(inMemoryStream);
        System.setOut(printStream);

        Main.printSong();

        File goldenMasterFile = new File("./goldenMaster.txt");
        assertEquals(readStream(new ByteArrayInputStream(inMemoryStream.toByteArray())), readContent(goldenMasterFile));
    }

    public static void main(String [] args) throws FileNotFoundException {
        PrintStream goldenMasterFile = new PrintStream(new FileOutputStream("./goldenMaster.txt"));
        System.setOut(goldenMasterFile);

        Main.printSong();

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
};