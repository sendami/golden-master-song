package org.tw;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongGoldenMasterTest {
    @Test
    void checkOriginalSong() throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);

        SongGoldenMaster.writeTheSong();

        String actualSong = outStream.toString();
        String goldenMaster = Files.readString(Path.of("song.txt"));

        assertEquals(goldenMaster, actualSong);
    }

    //Method that generates the Golden Master
    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream("song.txt"));
        System.setOut(printStream);
        SongGoldenMaster.writeTheSong();
        printStream.close();
    }
}
