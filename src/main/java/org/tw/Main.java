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

        List<String> listOfAnimal = songBuilder.listOfAnimal;

        String song = songBuilder.buildStrophe(0) + LINE_BREAK +

                songBuilder.buildStrophe(1) + LINE_BREAK +

                songBuilder.buildStrophe(2) + LINE_BREAK +

                songBuilder.buildStrophe(3) + LINE_BREAK +

                songBuilder.buildStrophe(4) + LINE_BREAK +

                songBuilder.buildStrophe(5) + LINE_BREAK +

                Song.oldLadyEatsAnimal(listOfAnimal.get(6) + Song.TWO_DOTS, ".\n") +
                Song.TWO_DOTS + ".She's dead, of course!";

        System.out.println(song);
    }

}