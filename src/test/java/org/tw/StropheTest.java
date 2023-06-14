package org.tw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StropheTest {
    public static final String[] LIST_OF_ANIMALS = new String[]{"fly", "spider", "bird", "cat", "dog", "cow", "horse"};

    @ParameterizedTest
    @CsvSource(textBlock= """
            1, There was an old lady who swallowed a fly.
            2, There was an old lady who swallowed a spider;
            7, There was an old lady who swallowed a horse...
            """)
    public void shouldBuildThereWasDynamicallyInTheFirstVerse(int verseNumber, String expectedVerse) {
        String thereWasSentence = Strophe.buildThereWas(verseNumber, LIST_OF_ANIMALS);

        assertEquals(expectedVerse,
                thereWasSentence);
    }

    @Test
    public void shouldBuildSheSwallowedDynamicallyInTheFirstVerse() {
        String sheShallowSentence = Strophe.buildSheShallow(1, LIST_OF_ANIMALS);

        assertEquals("She swallowed the spider to catch the fly;",
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheSecondVerse() {
        String sheShallowSentence = Strophe.buildSheShallow(2, LIST_OF_ANIMALS);

        assertEquals("""
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;""",
                sheShallowSentence);
    }

    @Test
    public void shouldBuildSheShallowDynamicallyInTheFifthVerse() {
        String sheShallowSentence = Strophe.buildSheShallow(5, LIST_OF_ANIMALS);

        assertEquals("""
                She swallowed the cow to catch the dog,
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;""",
                sheShallowSentence);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1; ''",
            "2; That wriggled and wiggled and tickled inside her.",
            "3; How absurd to swallow a bird.",
            "4; Fancy that to swallow a cat!",
            "5; What a hog, to swallow a dog!",
            "6; I don't know how she swallowed a cow!",
            "7; ...She's dead, of course!"
    }, delimiter = ';')
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
}
