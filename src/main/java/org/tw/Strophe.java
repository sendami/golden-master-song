package org.tw;

public class Strophe {

    private final String[] listOfAnimals;

    Strophe(String[] listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }
    public String buildThereWas(int stropheNumber) {
        String sentence = String.format("There was an old lady who swallowed a %s", listOfAnimals[stropheNumber - 1]);
        return stropheNumber > 1 ?
                (stropheNumber == this.listOfAnimals.length ?
                        sentence + "...\n" :
                        sentence + ";\n") :
                sentence + ".\n";
    }

    public String buildSheShallow(int stropheNumber) {
        StringBuilder sheShallow = new StringBuilder();
        for (int i = stropheNumber - 1; i > 0; i--) {
            sheShallow.append(String.format("She swallowed the %s to catch the %s",
                    this.listOfAnimals[i],
                    this.listOfAnimals[i - 1]));
            if (i == 1) {
                sheShallow.append(";\n");
            } else {
                sheShallow.append(",\n");
            }
        }

        return sheShallow.toString();
    }

    public String buildVerseAfterThereWas(int stropheNumber) {
        return switch (stropheNumber) {
            default -> "";
            case 2 -> "That wriggled and wiggled and tickled inside her.\n";
            case 3 -> String.format("How absurd to swallow a %s.\n", this.listOfAnimals[stropheNumber - 1]);
            case 4 -> String.format("Fancy that to swallow a %s!\n", this.listOfAnimals[stropheNumber - 1]);
            case 5 -> String.format("What a hog, to swallow a %s!\n", this.listOfAnimals[stropheNumber - 1]);
            case 6 -> String.format("I don't know how she swallowed a %s!\n", this.listOfAnimals[stropheNumber - 1]);
            case 7 -> "...She's dead, of course!";
        };
    }

    public String buildStrophe(int stropheNumber) {
        String commonFirstAndLastStrophe = this.buildThereWas(stropheNumber) +
                this.buildVerseAfterThereWas(stropheNumber);
        if (stropheNumber == listOfAnimals.length || listOfAnimals.length == 1) {
            return commonFirstAndLastStrophe;
        } else {
            return commonFirstAndLastStrophe +
                    this.buildSheShallow(stropheNumber) +
                    "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                    "\n";
        }
    }

    public int getNumberOfStrophes() {
        return this.listOfAnimals.length;
    }
}
