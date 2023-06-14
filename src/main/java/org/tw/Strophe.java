package org.tw;

public class Strophe {
    public static String buildThereWas(int verseNumber, String[] listOfAnimals) {
        String sentence = String.format("There was an old lady who swallowed a %s", listOfAnimals[verseNumber - 1]);
        return verseNumber > 1 ?
                (verseNumber == listOfAnimals.length ?
                        sentence + "..." :
                        sentence + ";") :
                sentence + ".";
    }

    public static String buildSheShallow(int verseNumber, String[] listOfAnimals) {
        StringBuilder sheShallow = new StringBuilder();
        for (int i = verseNumber; i > 0; i--) {
            sheShallow.append(String.format("She swallowed the %s to catch the %s",
                    listOfAnimals[i],
                    listOfAnimals[i - 1]));
            if (i == 1) {
                sheShallow.append(";");
            } else {
                sheShallow.append(",\n");
            }
        }

        return sheShallow.toString();
    }

    public static String buildVerseAfterThereWas(int verseNumber, String[] listOfAnimals) {
        return switch (verseNumber) {
            default -> "";
            case 2 -> "That wriggled and wiggled and tickled inside her.";
            case 3 -> String.format("How absurd to swallow a %s.", listOfAnimals[verseNumber - 1]);
            case 4 -> String.format("Fancy that to swallow a %s!", listOfAnimals[verseNumber - 1]);
            case 5 -> String.format("What a hog, to swallow a %s!", listOfAnimals[verseNumber - 1]);
            case 6 -> String.format("I don't know how she swallowed a %s!", listOfAnimals[verseNumber - 1]);
            case 7 -> "...She's dead, of course!";
        };
    }

    public static String buildStrophe(int stropheNumber, String[] listOfAnimals) {
        return buildThereWas(stropheNumber, listOfAnimals) +
                "\nI don't know why she swallowed a fly - perhaps she'll die!\n";
    }
}
