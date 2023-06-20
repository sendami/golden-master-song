package org.tw;

import java.util.Arrays;

public class Song {
    public static void main(String[] args) {
        printSong();
    }

    public static void printSong() {
        String song = """
                There was an old lady who swallowed a fly.
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a spider;
                That wriggled and wiggled and tickled inside her.
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a bird;
                How absurd to swallow a bird.
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a cat;
                Fancy that to swallow a cat!
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a dog;
                What a hog, to swallow a dog!
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a cow;
                I don't know how she swallowed a cow!
                She swallowed the cow to catch the dog,
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                There was an old lady who swallowed a horse...
                ...She's dead, of course!""";

        System.out.println(song);
    }

    public static void printSong(Strophe strophe) {
        StringBuilder song = new StringBuilder();
        for(int i = 1; i <= strophe.numberOfAnimals; i++) {
            song.append(strophe.buildStrophe(i));
        }

        System.out.println(song);
    }

}