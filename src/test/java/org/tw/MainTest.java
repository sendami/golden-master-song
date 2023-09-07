package org.tw;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    // Add a first test that compares the code implemented with
    @Test
    public void shouldMatchGoldenMaster() throws IOException {
        ByteArrayOutputStream inMemoryStream = new ByteArrayOutputStream();
        PrintStream printStream= new PrintStream(inMemoryStream);
        System.setOut(printStream);

        Main.printSong();

        assertEquals(Files.readString(Path.of("./goldenMaster.txt")), inMemoryStream.toString());
    }

    public static void main(String [] args) throws FileNotFoundException {
        PrintStream goldenMasterFile = new PrintStream(new FileOutputStream("./goldenMaster.txt"));
        System.setOut(goldenMasterFile);

        Main.printSong();

        goldenMasterFile.close();
    }
};