package org.tw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    @Test
    public void shouldGenerateASongWithOneAnimal() {
        List<String> listOfAnimal = List.of("fly");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());
    }

    @Test
    public void shouldGenerateASongWithTwoAnimals() {
        List<String> listOfAnimal = List.of("fly", "spider");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());
    }

    @Test
    public void shouldGenerateASongWithThreeAnimals() {
        List<String> listOfAnimal = List.of("fly", "spider", "bird");
        Song songBuilder = new Song(listOfAnimal);

        String expectedSong = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";

        assertEquals(expectedSong, songBuilder.song());

    }
}
