package org.tw;

import java.util.List;

public class Song {

    public static final String LINE_BREAK = "\n";
    public static final String EXCLAMATION_LINE_BREAK = "!\n";
    public static final String DOT_LINE_BREAK = ".\n";
    public static final String SEMICOLON_LINE_BREAK = ";\n";
    public static final String COLON_LINE_BREAK = ",\n";
    public static final String HOW_ABSURD_TO_SWALLOW_A = "How absurd to swallow a ";
    public static final String FANCY_THAT_TO_SWALLOW_A = "Fancy that to swallow a ";
    public static final String WHAT_A_HOG_TO_SWALLOW_A = "What a hog, to swallow a ";
    public static final String I_DON_T_KNOW_HOW_SHE_SWALLOWED_A = "I don't know how she swallowed a ";
    public static final String TWO_DOTS = "..";
    public List<String> listOfAnimal;

    public Song(List<String> listOfAnimal) {
        this.listOfAnimal = listOfAnimal;
    }
    public static String predatorEatsPrey(String predator, String prey, String endOfLine) {
        return "She swallowed the " + predator + " to catch the " + prey + endOfLine;
    }
    public static String oldLadyEatsAnimal(String animal, String endOfLine) {
        return "There was an old lady who swallowed a " + animal + endOfLine;
    }
    public String iDontKnowWhySheSwallowedPerhapsShellDie(String animal) {
        if (listOfAnimal.size() > 2) {
            return "I don't know why she swallowed a " + animal + " - perhaps she'll die" + EXCLAMATION_LINE_BREAK + LINE_BREAK;
        }
        return "I don't know why she swallowed a " + animal + " - perhaps she'll die" + EXCLAMATION_LINE_BREAK;
    }
    public String song() {
        String firstFragment = oldLadyEatsAnimal(listOfAnimal.get(0), DOT_LINE_BREAK) +
                iDontKnowWhySheSwallowedPerhapsShellDie(listOfAnimal.get(0));

        String fragment = listOfAnimal.size() > 1 ?
                LINE_BREAK +
                oldLadyEatsAnimal(listOfAnimal.get(1), Song.SEMICOLON_LINE_BREAK) +
                        "That wriggled and wiggled and tickled inside her" + Song.DOT_LINE_BREAK +
                        predatorEatsPrey(listOfAnimal.get(1), listOfAnimal.get(0), Song.SEMICOLON_LINE_BREAK) +
                        iDontKnowWhySheSwallowedPerhapsShellDie(listOfAnimal.get(0)) : "";

        return firstFragment + fragment;
    }
}
