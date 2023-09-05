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

    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        String song = THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "fly" + DOT_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "spider" + SEMICOLON_LINE_BREAK +
                "That wriggled and wiggled and tickled inside her" + DOT_LINE_BREAK +
                SHE_SWALLOWED_THE + "spider" + TO_CATCH_THE + "fly" + SEMICOLON_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "bird" + SEMICOLON_LINE_BREAK +
                "How absurd to swallow a bird" + DOT_LINE_BREAK +
                SHE_SWALLOWED_THE + "bird" + TO_CATCH_THE + "spider,\n" +
                SHE_SWALLOWED_THE + "spider" + TO_CATCH_THE + "fly" + SEMICOLON_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "cat" + SEMICOLON_LINE_BREAK +
                "Fancy that to swallow a cat" + EXCLAMATION_LINE_BREAK +
                SHE_SWALLOWED_THE + "cat" + TO_CATCH_THE + "bird,\n" +
                SHE_SWALLOWED_THE + "bird" + TO_CATCH_THE + "spider,\n" +
                SHE_SWALLOWED_THE + "spider" + TO_CATCH_THE + "fly" + SEMICOLON_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "dog" + SEMICOLON_LINE_BREAK +
                "What a hog, to swallow a dog" + EXCLAMATION_LINE_BREAK +
                SHE_SWALLOWED_THE + "dog" + TO_CATCH_THE + "cat,\n" +
                SHE_SWALLOWED_THE + "cat" + TO_CATCH_THE + "bird,\n" +
                SHE_SWALLOWED_THE + "bird" + TO_CATCH_THE + "spider,\n" +
                SHE_SWALLOWED_THE + "spider" + TO_CATCH_THE + "fly" + SEMICOLON_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "cow" + SEMICOLON_LINE_BREAK +
                "I don't know how she swallowed a cow" + EXCLAMATION_LINE_BREAK +
                SHE_SWALLOWED_THE + "cow" + TO_CATCH_THE + "dog,\n" +
                SHE_SWALLOWED_THE + "dog" + TO_CATCH_THE + "cat,\n" +
                SHE_SWALLOWED_THE + "cat" + TO_CATCH_THE + "bird,\n" +
                SHE_SWALLOWED_THE + "bird" + TO_CATCH_THE + "spider,\n" +
                SHE_SWALLOWED_THE + "spider" + TO_CATCH_THE + "fly" + SEMICOLON_LINE_BREAK +
                I_DON_T_KNOW_WHY_SHE_SWALLOWED_A_FLY_PERHAPS_SHE_LL_DIE +
                THERE_WAS_AN_OLD_LADY_WHO_SWALLOWED_A + "horse.." + DOT_LINE_BREAK +
                "...She's dead, of course!";

        System.out.println(song);
    }
}