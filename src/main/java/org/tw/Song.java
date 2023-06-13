package org.tw;

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

    public static void printSong(String[] thereWas) {
        String song = """
                %s.
                I don't know why she swallowed a fly - perhaps she'll die!

                %s;
                That wriggled and wiggled and tickled inside her.
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                %s;
                How absurd to swallow a bird.
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                %s;
                Fancy that to swallow a cat!
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                %s;
                What a hog, to swallow a dog!
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                %s;
                I don't know how she swallowed a cow!
                She swallowed the cow to catch the dog,
                She swallowed the dog to catch the cat,
                She swallowed the cat to catch the bird,
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                %s...
                ...She's dead, of course!""";

        String refactoredSong = String.format(song,
                thereWas[0],
                thereWas[1],
                thereWas[2],
                thereWas[3],
                thereWas[4],
                thereWas[5],
                thereWas[6]);

        System.out.println(refactoredSong);
    }
}