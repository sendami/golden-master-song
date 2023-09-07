package org.tw;

import java.util.Arrays;
import java.util.List;

import static org.tw.Song.LINE_BREAK;

public class Main {

    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        Song songBuilder = new Song(Arrays.asList("fly", "spider", "bird", "cat", "dog", "cow", "horse"));

        System.out.println(songBuilder.song());
    }

}