package org.tw;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        Song songBuilder = new Song(Arrays.asList("fly", "spider", "bird", "cat", "dog", "cow", "horse"));

        List<String> listOfAnimal = songBuilder.listOfAnimal;

        String song = Song.oldLadyEatsAnimal(listOfAnimal.get(0), Song.DOT_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(1), Song.SEMICOLON_LINE_BREAK) +
                "That wriggled and wiggled and tickled inside her" + Song.DOT_LINE_BREAK +
                Song.predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(2), Song.SEMICOLON_LINE_BREAK) +
                Song.HOW_ABSURD_TO_SWALLOW_A + listOfAnimal.get(2) + Song.DOT_LINE_BREAK +
                Song.predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(3), Song.SEMICOLON_LINE_BREAK) +
                Song.FANCY_THAT_TO_SWALLOW_A + listOfAnimal.get(3) + Song.EXCLAMATION_LINE_BREAK +
                Song.predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(4), Song.SEMICOLON_LINE_BREAK) +
                Song.WHAT_A_HOG_TO_SWALLOW_A + listOfAnimal.get(4) + Song.EXCLAMATION_LINE_BREAK +
                Song.predatorEatsPrey(listOfAnimal.get(4), listOfAnimal.get(3), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(5), Song.SEMICOLON_LINE_BREAK) +
                Song.I_DON_T_KNOW_HOW_SHE_SWALLOWED_A + listOfAnimal.get(5) + Song.EXCLAMATION_LINE_BREAK +
                Song.predatorEatsPrey(listOfAnimal.get(5), listOfAnimal.get(4), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(4), listOfAnimal.get(3), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), Song.COLON_LINE_BREAK) +
                Song.predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                Song.iDontKnowWhySheSwalledPerhapsShellDie(listOfAnimal.get(0)) +
                Song.oldLadyEatsAnimal(listOfAnimal.get(6) + Song.TWO_DOTS, Song.DOT_LINE_BREAK) +
                Song.TWO_DOTS + ".She's dead, of course!";

        System.out.println(song);
    }

}