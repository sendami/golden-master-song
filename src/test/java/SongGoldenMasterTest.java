import org.junit.jupiter.api.Test;
import org.tw.Main;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongGoldenMasterTest {
    @Test
    void checkOriginalSong() throws IOException {
        String expectedSong = Files.readString(Paths.get("song.txt"));
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outStream);
        System.setOut(printStream);
        Main.writeTheSong();
        String song = outStream.toString();
        assertEquals(expectedSong, song);
    }

    public static void main(String[] args) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream("song.txt"));
        System.setOut(printStream);
        Main.writeTheSong();
    }
}
