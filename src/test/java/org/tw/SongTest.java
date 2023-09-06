package org.tw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void shouldGenerateASongWithOneAnimal() {
        List<String> listOfAnimal = List.of("OneAnimal");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a OneAnimal.\n" +
                "I don't know why she swallowed a OneAnimal - perhaps she'll die!\n" +
                "\n" +
                "...She's dead, of course!";

        assertEquals(expectedSong, songBuilder.song());
    }

    @Test
    public void shouldGenerateASongWithTwoAnimals() {
        List<String> listOfAnimal = List.of("firstAnimal", "SecondAnimal");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a firstAnimal.\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a SecondAnimal;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the SecondAnimal to catch the firstAnimal;\n" +
                "I don't know why she swallowed a firstAnimal - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a SecondAnimal...\n" +
                "...She's dead, of course!";

        assertEquals(expectedSong, songBuilder.song());
    }
}
