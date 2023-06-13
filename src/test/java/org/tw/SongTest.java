package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    public static final String GOLDEN_MASTER_PATH = "./goldenMaster.txt";

    private ByteArrayOutputStream inMemoryStream;

    @BeforeEach
    public void setupOutput() {
        inMemoryStream = new ByteArrayOutputStream();
        PrintStream printedSong = new PrintStream(inMemoryStream);
        System.setOut(printedSong);
    }

    @Test
    public void shouldBeTheSameThanGoldenMaster() throws IOException {
        Song.printSong();

        assertEquals(expectedSong(inMemoryStream), readContent(new File(GOLDEN_MASTER_PATH)));
    }

    @Test
    public void shouldAddDynamicallyThereWasAnOldLadyThatSwallowedAnAnimalSentence() throws IOException {
        String[] listOfAnimals = {"fly", "spider", "bird", "cat", "dog", "cow", "horse"};
        String[] thereWas = Arrays.stream(listOfAnimals).map(animal ->
                String.format("There was an old lady who swallowed a %s", animal))
                        .toArray(String[]::new);

        Song.printSong(thereWas);

        assertEquals(expectedSong(inMemoryStream), readContent(new File(GOLDEN_MASTER_PATH)));
    }

    private static List<String> expectedSong(ByteArrayOutputStream inMemoryStream) throws IOException {
        return readStream(new ByteArrayInputStream(inMemoryStream.toByteArray()));
    }

    private static List<String> readContent(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        return readStream(fileInputStream);
    }

    private static List<String> readStream(InputStream byteArrayInputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
        List<String> result = new ArrayList<>();
        while (reader.ready()) {
            result.add(reader.readLine());
        }
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream goldenMasterFile = new PrintStream(new FileOutputStream(GOLDEN_MASTER_PATH));
        System.setOut(goldenMasterFile);

        Song.printSong();

        goldenMasterFile.close();
    }

}
