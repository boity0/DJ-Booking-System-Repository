package za.ac.cput.factory;

import za.ac.cput.domain.Song;

public class SongHelper {



 static void printSongDetails(@org.jetbrains.annotations.NotNull Song song) {
        System.out.println("Song Details:");
        System.out.println("ID: " + song.getSongID());
        System.out.println("Title: " + song.getSongTitle());
        System.out.println("Duration: " + song.getSongDuration() + " seconds");
        System.out.println("Genre: " + song.getSongGenre());
        System.out.println("Year: " + song.getSongYear());
    }
}