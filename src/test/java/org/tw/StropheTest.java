package org.tw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StropheTest {
    public static final String[] LIST_OF_ANIMALS = new String[]{"fly", "spider", "bird", "cat", "dog", "cow", "horse"};

    @ParameterizedTest
    @CsvSource(textBlock = """
            1, "There was an old lady who swallowed a fly.\n"
            2, "There was an old lady who swallowed a spider;\n"
            7, "There was an old lady who swallowed a horse...\n"
            """,
            quoteCharacter = '"')
    public void shouldBuildThereWasDynamicallyInTheFirstVerse(int verseNumber, String expectedVerse) {
        String thereWasSentence = Strophe.buildThereWas(verseNumber, LIST_OF_ANIMALS);

        assertEquals(expectedVerse,
                thereWasSentence);
    }

    @Test
    public void shouldNotBuildSheShallowDynamicallyInTheFirsStrophe() {
        String sheShallowSentence = Strophe.buildSheShallow(1, LIST_OF_ANIMALS);

        assertEquals("", sheShallowSentence);
    }

    @Test
    public void shouldBuildSheSwallowedDynamicallyInTheSecondStrophe() {
        String sheShallowSentence = Strophe.buildSheShallow(2, LIST_OF_ANIMALS);

        assertEquals("She swallowed the spider to catch the fly;\n",
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheThirdStrophe() {
        String sheShallowSentence = Strophe.buildSheShallow(3, LIST_OF_ANIMALS);

        assertEquals("""
                        She swallowed the bird to catch the spider,
                        She swallowed the spider to catch the fly;
                        """,
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheSixStrophe() {
        String sheShallowSentence = Strophe.buildSheShallow(6, LIST_OF_ANIMALS);

        assertEquals("""
                        She swallowed the cow to catch the dog,
                        She swallowed the dog to catch the cat,
                        She swallowed the cat to catch the bird,
                        She swallowed the bird to catch the spider,
                        She swallowed the spider to catch the fly;
                        """,
                sheShallowSentence);
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            1; ""
            2; "That wriggled and wiggled and tickled inside her.\n"
            3; "How absurd to swallow a bird.\n"
            4; "Fancy that to swallow a cat!\n"
            5; "What a hog, to swallow a dog!\n"
            6; "I don't know how she swallowed a cow!\n"
            7; ...She's dead, of course!
            """
            , delimiter = ';'
            , quoteCharacter = '"'
            , emptyValue = ""
    )
    public void shouldBuildVerseAfterThereWasInTheFirstStrophe(int verseNumber, String expectedVerse) {
        String uniqueSentence = Strophe.buildVerseAfterThereWas(verseNumber, LIST_OF_ANIMALS);

        assertEquals(expectedVerse,
                uniqueSentence);
    }

    @Test
    public void shouldBuildFirstStrophe() {
        String firstStrophe = Strophe.buildStrophe(1, LIST_OF_ANIMALS);

        assertEquals("""                
                        There was an old lady who swallowed a fly.
                        I don't know why she swallowed a fly - perhaps she'll die!
                        """,
                firstStrophe);
    }

    @Test
    public void shouldBuildSecondStrophe() {
        String secondStrophe = Strophe.buildStrophe(2, LIST_OF_ANIMALS);

        assertEquals("""                
                        There was an old lady who swallowed a spider;
                        That wriggled and wiggled and tickled inside her.
                        She swallowed the spider to catch the fly;
                        I don't know why she swallowed a fly - perhaps she'll die!
                        """,
                secondStrophe);
    }
}
