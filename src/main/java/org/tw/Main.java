package org.tw;

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
        String song = oldLadyEatsAnimal("fly", DOT_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("spider", SEMICOLON_LINE_BREAK) +
                "That wriggled and wiggled and tickled inside her" + DOT_LINE_BREAK +
                spiderEatsFly() +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("bird", SEMICOLON_LINE_BREAK) +
                HOW_ABSURD_TO_SWALLOW_A + "bird" + DOT_LINE_BREAK +
                birdEatsSpider() +
                spiderEatsFly() +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("cat", SEMICOLON_LINE_BREAK) +
                FANCY_THAT_TO_SWALLOW_A + "cat" + EXCLAMATION_LINE_BREAK +
                catEatsBird() +
                birdEatsSpider() +
                spiderEatsFly() +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("dog", SEMICOLON_LINE_BREAK) +
                WHAT_A_HOG_TO_SWALLOW_A + "dog" + EXCLAMATION_LINE_BREAK +
                dogEatsCat() +
                catEatsBird() +
                birdEatsSpider() +
                spiderEatsFly() +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("cow", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_HOW_SHE_SWALLOWED_A + "cow" + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey("cow", "dog", COLON_LINE_BREAK) +
                dogEatsCat() +
                catEatsBird() +
                birdEatsSpider() +
                spiderEatsFly() +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                oldLadyEatsAnimal("horse" + TWO_DOTS, DOT_LINE_BREAK) +
                TWO_DOTS + ".She's dead, of course!";

        System.out.println(song);
    }

    private static String dogEatsCat() {
        return predatorEatsPrey("dog", "cat", COLON_LINE_BREAK);
    }

    private static String catEatsBird() {
        return predatorEatsPrey("cat", "bird", COLON_LINE_BREAK);
    }

    private static String spiderEatsFly() {
        return predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK);
    }

    private static String birdEatsSpider() {
        return predatorEatsPrey("bird", "spider", COLON_LINE_BREAK);
    }

    public static String predatorEatsPrey(String predator, String prey, String endOfLine) {
        return "She swallowed the " + predator + " to catch the " + prey + endOfLine;
    }

    public static String oldLadyEatsAnimal(String animal, String endOfLine) {
        return "There was an old lady who swallowed a " + animal + endOfLine;
    }

}