package org.tw;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String LINE_BREAK = "\n";
    public static final String EXCLAMATION_LINE_BREAK = "!\n";
    public static final String I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE = "I don't know why she swallowed a fly - perhaps she'll die" + EXCLAMATION_LINE_BREAK + LINE_BREAK;
    public static final String DOT_LINE_BREAK = ".\n";
    public static final String SEMICOLON_LINE_BREAK = ";\n";
    public static final String COLON_LINE_BREAK = ",\n";
    public static final String HOW_ABSURD_TO_SWALLOW_A = "How absurd to swallow a ";
    public static final String FANCY_THAT_TO_SWALLOW_A = "Fancy that to swallow a ";
    public static final String WHAT_A_HOG_TO_SWALLOW_A = "What a hog, to swallow a ";
    public static final String I_DON_T_KNOW_HOW_SHE_SWALLOWED_A = "I don't know how she swallowed a ";
    public static final String TWO_DOTS = "..";

    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        List<String> listOfAnimal = Arrays.asList("fly", "spider", "bird", "cat", "dog", "cow", "horse");


        String song = oldLadyEatsAnimal(listOfAnimal.get(0), DOT_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(1), SEMICOLON_LINE_BREAK) +
                "That wriggled and wiggled and tickled inside her" + DOT_LINE_BREAK +
                predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(2), SEMICOLON_LINE_BREAK) +
                HOW_ABSURD_TO_SWALLOW_A + listOfAnimal.get(2) + DOT_LINE_BREAK +
                predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(3), SEMICOLON_LINE_BREAK) +
                FANCY_THAT_TO_SWALLOW_A + listOfAnimal.get(3) + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(4), SEMICOLON_LINE_BREAK) +
                WHAT_A_HOG_TO_SWALLOW_A + listOfAnimal.get(4) + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey(listOfAnimal.get(4), listOfAnimal.get(3), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(5), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_HOW_SHE_SWALLOWED_A + listOfAnimal.get(5) + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey(listOfAnimal.get(5), listOfAnimal.get(4), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(4), listOfAnimal.get(3), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(3), listOfAnimal.get(2), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(2), listOfAnimal.get(1), COLON_LINE_BREAK) +
                predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal(listOfAnimal.get(6) + TWO_DOTS, DOT_LINE_BREAK) +
                TWO_DOTS + ".She's dead, of course!";

        System.out.println(song);
    }

    public static String predatorEatsPrey(String predator, String prey, String endOfLine) {
        return "She swallowed the " + predator + " to catch the " + prey + endOfLine;
    }

    public static String oldLadyEatsAnimal(String animal, String endOfLine) {
        return "There was an old lady who swallowed a " + animal + endOfLine;
    }

}