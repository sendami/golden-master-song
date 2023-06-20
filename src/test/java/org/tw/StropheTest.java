package org.tw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StropheTest {
    @Nested
    @DisplayName("Tests for original list of animals")
    class originalListOfAnimals {
        public static final String[] LIST_OF_ANIMALS = new String[]{"fly", "spider", "bird", "cat", "dog", "cow", "horse"};
        private final Strophe strophe = new Strophe(LIST_OF_ANIMALS);

        @ParameterizedTest
        @CsvSource(textBlock = """
                1, "There was an old lady who swallowed a fly.\n"
                2, "There was an old lady who swallowed a spider;\n"
                7, "There was an old lady who swallowed a horse...\n"
                """,
                quoteCharacter = '"')
        public void shouldBuildThereWasVerse(int verseNumber, String expectedVerse) {
            String thereWasSentence = strophe.buildThereWas(verseNumber);

            assertEquals(expectedVerse,
                    thereWasSentence);
        }

        @Test
        public void shouldBuildIDontKnowVerse() {
            String iDontKnowSentence = strophe.buildIDontKnow();

            assertEquals( "I don't know why she swallowed a fly - perhaps she'll die!\n\n",
                    iDontKnowSentence);
        }

        @Test
        public void shouldNotBuildSheShallowDynamicallyInTheFirsStrophe() {
            String sheShallowSentence = strophe.buildSheShallow(1);

            assertEquals("", sheShallowSentence);
        }

        @Test
        public void shouldBuildSheSwallowedDynamicallyInTheSecondStrophe() {
            String sheShallowSentence = strophe.buildSheShallow(2);

            assertEquals("She swallowed the spider to catch the fly;\n",
                    sheShallowSentence);
        }

        @Test
        public void shouldBuildSheShallowDynamicallyInTheThirdStrophe() {
            String sheShallowSentence = strophe.buildSheShallow(3);

            assertEquals("""
                            She swallowed the bird to catch the spider,
                            She swallowed the spider to catch the fly;
                            """,
                    sheShallowSentence);
        }

        @Test
        public void shouldBuildSheShallowDynamicallyInTheSixStrophe() {
            String sheShallowSentence = strophe.buildSheShallow(6);

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
        )
        public void shouldBuildVerseAfterThereWasInTheFirstStrophe(int verseNumber, String expectedVerse) {
            String uniqueSentence = strophe.buildVerseAfterThereWas(verseNumber);

            assertEquals(expectedVerse,
                    uniqueSentence);
        }

        @Test
        public void shouldBuildFirstStrophe() {
            String firstStrophe = strophe.buildStrophe(1);

            assertEquals("""                
                            There was an old lady who swallowed a fly.
                            I don't know why she swallowed a fly - perhaps she'll die!
                                                    
                            """,
                    firstStrophe);
        }

        @Test
        public void shouldBuildSecondStrophe() {
            String secondStrophe = strophe.buildStrophe(2);

            assertEquals("""                
                            There was an old lady who swallowed a spider;
                            That wriggled and wiggled and tickled inside her.
                            She swallowed the spider to catch the fly;
                            I don't know why she swallowed a fly - perhaps she'll die!
                                                    
                            """,
                    secondStrophe);
        }

        @Test
        public void shouldBuildSeventhStrophe() {
            String seventhStrophe = strophe.buildStrophe(7);

            assertEquals("""
                            There was an old lady who swallowed a horse...
                            ...She's dead, of course!""",
                    seventhStrophe);
        }

    }

    @Nested
    @DisplayName("Different list of animals")
    class shouldPrintSongWithDifferentListOfAnimals {
        @Test
        public void shouldPrintASongWithAListWithOneAnimal() {
            final String[] LIST_OF_ANIMALS = new String[]{"fish"};
            final Strophe strophe = new Strophe(LIST_OF_ANIMALS);

            String firstStrophe = strophe.buildStrophe(1);
            String secondStrophe = strophe.buildStrophe(2);

            assertEquals("""
                            There was an old lady who swallowed a fish.
                            I don't know why she swallowed a fish - perhaps she'll die!
                            """,
                    firstStrophe);
            assertEquals("", secondStrophe);
        }
    }
}
