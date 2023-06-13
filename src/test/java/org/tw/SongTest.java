package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.tw.Song.buildThereWasSentences;

public class SongTest {

    public static final String GOLDEN_MASTER_PATH = "./goldenMaster.txt";
    public static final String[] LIST_OF_ANIMALS = new String[]{"fly", "spider", "bird", "cat", "dog", "cow", "horse"};

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
        Song.printSong(buildThereWasSentences(LIST_OF_ANIMALS));

        assertEquals(expectedSong(inMemoryStream), readContent(new File(GOLDEN_MASTER_PATH)));
    }

    @Test
    public void shouldBuildThereWasDynamicallyInTheFirstVerse() {
        String thereWasSentence = Song.buildThereWas(1, LIST_OF_ANIMALS);

        assertEquals("There was an old lady who swallowed a fly.",
                thereWasSentence);
    }

    @Test
    public void shouldBuildThereWasDynamicallyInTheSecondVerse() {
        String thereWasSentence = Song.buildThereWas(2, LIST_OF_ANIMALS);

        assertEquals("There was an old lady who swallowed a spider;",
                thereWasSentence);
    }

    @Test
    public void shouldBuildThereWasDynamicallyInTheSeventhVerse() {
        String thereWasSentence = Song.buildThereWas(7, LIST_OF_ANIMALS);

        assertEquals("There was an old lady who swallowed a horse...",
                thereWasSentence);
    }

    @Test
    public void shouldBuildSheSwallowedDynamicallyInTheFirstVerse() {
        String sheShallowSentence = Song.buildSheShallow(1, LIST_OF_ANIMALS);

        assertEquals("She swallowed the spider to catch the fly;",
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheSecondVerse() {
        String sheShallowSentence = Song.buildSheShallow(2, LIST_OF_ANIMALS);

        assertEquals("""
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;""",
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheFifthVerse() {
        String sheShallowSentence = Song.buildSheShallow(5, LIST_OF_ANIMALS);

        assertEquals("""
                She swallowed the cow to catch the dog,
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;""",
                sheShallowSentence);
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
