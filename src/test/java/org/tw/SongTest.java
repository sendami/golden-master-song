package org.tw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void shouldGenerateASongWithOneAnimal() {
        List<String> listOfAnimal = List.of("oneAnimal");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a oneAnimal.\n" +
                "I don't know why she swallowed a oneAnimal - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());
    }

    @Test
    public void shouldGenerateASongWithTwoAnimals() {
        List<String> listOfAnimal = List.of("firstAnimal", "secondAnimal");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a firstAnimal.\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a secondAnimal;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the secondAnimal to catch the firstAnimal;\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());
    }

    @Test
    public void shouldGenerateASongWithThreeAnimals() {
        List<String> listOfAnimal = List.of("firstAnimal", "secondAnimal", "thirdAnimal");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a firstAnimal.\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n" +
                "\n" +

                "There was an old lady who swallowed a secondAnimal;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the secondAnimal to catch the firstAnimal;\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n" +
                "\n" +

                "There was an old lady who swallowed a thirdAnimal;\n" +
                "How absurd to swallow a thirdAnimal.\n" +
                "She swallowed the thirdAnimal to catch the secondAnimal,\n" +
                "She swallowed the secondAnimal to catch the firstAnimal;\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());

    }
}
