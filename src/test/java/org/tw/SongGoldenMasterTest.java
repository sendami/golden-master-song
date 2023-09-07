package org.tw;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongGoldenMasterTest {
    @Test
    void checkOriginalSong() throws IOException {
        // Generate the snapshot to compare it with the golden master
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);

        SongGoldenMaster.writeTheSong();

        // Expected string is the golden master song.txt
        // Actual string is the snapshot generated when we call Main.writeTheSong
        assertEquals(Files.readString(Path.of("song.txt")), outStream.toString());
    }

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream("song.txt"));
        System.setOut(printStream);
        SongGoldenMaster.writeTheSong();
        printStream.close();
    }
}
