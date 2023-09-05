package org.tw;

import org.junit.jupiter.api.Test;
import org.tw.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MainTest {

    public static void main(String [] args) throws FileNotFoundException {
        PrintStream goldenMasterFile = new PrintStream(new FileOutputStream("./goldenMaster.txt"));
        System.setOut(goldenMasterFile);

        Main.printSong();

        goldenMasterFile.close();
    }
}
