package org.tw;

import java.util.List;

public class Song {

    public static final String LINE_BREAK = "\n";
    public static final String SEMICOLON_LINE_BREAK = ";\n";
    public static final String COLON_LINE_BREAK = ",\n";
    public static final String TWO_DOTS = "..";
    public List<String> listOfAnimal;

    public Song(List<String> listOfAnimal) {
        this.listOfAnimal = listOfAnimal;
    }

    public String specialVerse(int verseNumber) {
        return switch (verseNumber) {
            case 1 -> "That wriggled and wiggled and tickled inside her.\n";
            case 2 -> "How absurd to swallow a " + listOfAnimal.get(2) + ".\n";
            case 3 -> "Fancy that to swallow a " + listOfAnimal.get(3) + "!\n";
            case 4 -> "What a hog, to swallow a " + listOfAnimal.get(4) + "!\n";
            case 5 ->  "I don't know how she swallowed a " + listOfAnimal.get(5) + "!\n";
            default -> "";
        };
    }

    public static String predatorEatsPrey(String predator, String prey, String endOfLine) {
        return "She swallowed the " + predator + " to catch the " + prey + endOfLine;
    }

    public static String oldLadyEatsAnimal(String animal, String endOfLine) {
        return "There was an old lady who swallowed a " + animal + endOfLine;
    }

    public String oldLadyEatsAnimal(int verseNumber) {
        if (verseNumber == 0) {
            return oldLadyEatsAnimal(listOfAnimal.get(verseNumber), ".\n");
        }
        ;
        if (verseNumber >= 1 || verseNumber <= listOfAnimal.size() - 2) {
            return oldLadyEatsAnimal(listOfAnimal.get(verseNumber), SEMICOLON_LINE_BREAK);
        }
        if (verseNumber == listOfAnimal.size() - 1) {
            return oldLadyEatsAnimal(listOfAnimal.get(verseNumber), "...\n");
        }
        return "";
    }

    public String iDontKnowWhySheSwallowedPerhapsShellDie(String animal) {
         return "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n";
    }

    public StringBuilder buildPredatorsEatPrey(int verseNumber) {
        StringBuilder result = new StringBuilder();

        if (verseNumber == 0) {
            return result;
        }

        for (int i = verseNumber; i > 0; i--) {
            result.append(predatorEatsPrey(
                    listOfAnimal.get(i),
                    listOfAnimal.get(i-1),
                    (i - 1 == 0 ? SEMICOLON_LINE_BREAK : COLON_LINE_BREAK)));
        }

        return result;
    }

    public String buildStrophe(int verseNumber) {
        return oldLadyEatsAnimal(verseNumber) +

                specialVerse(verseNumber) +

                buildPredatorsEatPrey(verseNumber) +

                (verseNumber <= listOfAnimal.size() - 1 ?
                        iDontKnowWhySheSwallowedPerhapsShellDie(listOfAnimal.get(0)) :
                        "");
    }

    public String song() {
        StringBuilder allFragments = new StringBuilder();
        for (int verseNumber = 0; verseNumber < listOfAnimal.size(); verseNumber++) {
            allFragments.append(buildStrophe(verseNumber))
                    .append((verseNumber == listOfAnimal.size() - 1) ? "" : LINE_BREAK);
        }

        return String.valueOf(allFragments);
    }
}
