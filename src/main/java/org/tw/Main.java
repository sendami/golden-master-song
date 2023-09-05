package org.tw;

public class Main {
    public static final String THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A = "There was an old lady who swallowed a ";
    public static final String LINE_BREAK = "\n";
    public static final String EXCLAMATION_LINE_BREAK = "!\n";
    public static final String I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE = "I don't know why she swallowed a fly - perhaps she'll die" + EXCLAMATION_LINE_BREAK + LINE_BREAK;
    public static final String SHE_SWALLOWED_THE = "She swallowed the ";
    public static final String TO_CATCH_THE = " to catch the ";
    public static final String DOT_LINE_BREAK = ".\n";
    public static final String SEMICOLON_LINE_BREAK = ";\n";
    public static final String COLON_LINE_BREAK = ",\n";

    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        String song = THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "fly" + DOT_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "spider" + SEMICOLON_LINE_BREAK +
                "That wriggled and wiggled and tickled inside her" + DOT_LINE_BREAK +
                predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "bird" + SEMICOLON_LINE_BREAK +
                "How absurd to swallow a bird" + DOT_LINE_BREAK +
                predatorEatsPrey("bird", "spider", COLON_LINE_BREAK) +
                predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "cat" + SEMICOLON_LINE_BREAK +
                "Fancy that to swallow a cat" + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey("cat", "bird", COLON_LINE_BREAK) +
                predatorEatsPrey("bird", "spider", COLON_LINE_BREAK) +
                predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "dog" + SEMICOLON_LINE_BREAK +
                "What a hog, to swallow a dog" + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey("dog", "cat", COLON_LINE_BREAK) +
                predatorEatsPrey("cat", "bird", COLON_LINE_BREAK) +
                predatorEatsPrey("bird", "spider", COLON_LINE_BREAK) +
                predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "cow" + SEMICOLON_LINE_BREAK +
                "I don't know how she swallowed a cow" + EXCLAMATION_LINE_BREAK +
                predatorEatsPrey("cow", "dog", COLON_LINE_BREAK) +
                predatorEatsPrey("dog", "cat", COLON_LINE_BREAK) +
                predatorEatsPrey("cat", "bird", COLON_LINE_BREAK) +
                predatorEatsPrey("bird", "spider", COLON_LINE_BREAK) +
                predatorEatsPrey("spider", "fly", SEMICOLON_LINE_BREAK) +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "horse.." + DOT_LINE_BREAK +
                "...She's dead, of course!";

        System.out.println(song);
    }

    public static String predatorEatsPrey(String predator, String prey, String endOfLine) {
        return SHE_SWALLOWED_THE + predator + TO_CATCH_THE + prey + endOfLine;
    }

}