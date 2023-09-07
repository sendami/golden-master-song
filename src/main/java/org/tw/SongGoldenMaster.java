package org.tw;

public class SongGoldenMaster {
    public static void main(String[] args) {
        writeTheSong();
    }

    public static void writeTheSong() {
        String song = thereWasAnOldLadyWhoSwallowed("fly", ".") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("spider", ";") +
                "That wriggled and wiggled and tickled inside her.\n" +
                sheSwallowedToCatch("spider", "fly", ";") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("bird", ";") +
                "How absurd to swallow a bird.\n" +
                sheSwallowedToCatch("bird", "spider", ",") +
                sheSwallowedToCatch("spider", "fly", ";") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("cat", ";") +
                "Fancy that to swallow a cat!\n" +
                sheSwallowedToCatch("cat", "bird", ",") +
                sheSwallowedToCatch("bird", "spider", ",") +
                sheSwallowedToCatch("spider", "fly", ";") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("dog", ";") +
                "What a hog, to swallow a dog!\n" +
                sheSwallowedToCatch("dog", "cat", ",") +
                sheSwallowedToCatch("cat", "bird", ",") +
                sheSwallowedToCatch("bird", "spider", ",") +
                sheSwallowedToCatch("spider", "fly", ";") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("cow", ";") +
                "I don't know how she swallowed a cow!\n" +
                sheSwallowedToCatch("cow", "dog", ",") +
                sheSwallowedToCatch("dog", "cat", ",") +
                sheSwallowedToCatch("cat", "bird", ",") +
                sheSwallowedToCatch("bird", "spider", ",") +
                sheSwallowedToCatch("spider", "fly", ";") +
                dontKnowWhySheSwallowed("fly") +
                "\n" +
                thereWasAnOldLadyWhoSwallowed("horse", "...") +
                "...She's dead, of course!";

        System.out.println(song);
    }

    private static String sheSwallowedToCatch(String predator, String meal, String punctuation) {
        return "She swallowed the " + predator + " to catch the " + meal + punctuation + "\n";
    }

    private static String dontKnowWhySheSwallowed(String animal) {
        return "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n";
    }

    private static String thereWasAnOldLadyWhoSwallowed(String animal, String punctuation) {
        return "There was an old lady who swallowed a " + animal + punctuation + "\n";
    }
}