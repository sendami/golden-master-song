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
        if (verseIsPartOfMiddleStrophe(verseNumber)) {
            return oldLadyEatsAnimal(listOfAnimal.get(verseNumber), SEMICOLON_LINE_BREAK);
        } else {
            return oldLadyEatsAnimal(listOfAnimal.get(verseNumber), "...\n");
        }
    }

    private boolean verseIsPartOfMiddleStrophe(int stropheNumber) {
        if (couldBeLastAnimal()) {
            return stropheNumber >= 1 && !lastStrophe(stropheNumber);
        } else {
            return stropheNumber >= 1;
        }
    }

    private boolean lastStrophe(int stropheNumber) {
        return stropheNumber == listOfAnimal.size() - 1;
    }

    private boolean couldBeLastAnimal() {
        return listOfAnimal.size() > 5;
    }

    public String iDontKnowWhySheSwallowedPerhapsShellDie(String animal) {
         return "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n";
    }

    private StringBuilder buildPredatorsEatPrey(int stropheNumber) {
        StringBuilder result = new StringBuilder();

        if (verseIsPartOfMiddleStrophe(stropheNumber)) {
            for (int i = stropheNumber; i > 0; i--) {
                result.append(predatorEatsPrey(
                        listOfAnimal.get(i),
                        listOfAnimal.get(i - 1),
                        (i - 1 == 0 ? SEMICOLON_LINE_BREAK : COLON_LINE_BREAK)));
            }
        }
        return result;
    }

    private String buildLastVerse(int stropheNumber) {
        return lastStrophe(stropheNumber) && couldBeLastAnimal() ?
                "...She's dead, of course!" :
                iDontKnowWhySheSwallowedPerhapsShellDie(listOfAnimal.get(0));
    }

    public String buildStrophe(int stropheNumber) {
        return oldLadyEatsAnimal(stropheNumber) +
                specialVerse(stropheNumber) +
                buildPredatorsEatPrey(stropheNumber) +
                buildLastVerse(stropheNumber);
    }

    public String song() {
        StringBuilder allFragments = new StringBuilder();
        for (int stropheNumber = 0; stropheNumber < listOfAnimal.size(); stropheNumber++) {
            allFragments.append(buildStrophe(stropheNumber))
                    .append(lastStrophe(stropheNumber) ? "" : LINE_BREAK);
        }

        return String.valueOf(allFragments);
    }
}
