package za.ac.cput.factory;

import za.ac.cput.factory.SongFactory;
import za.ac.cput.domain.Song;
import za.ac.cput.factory.SongHelper;

public class SongTester {
    public static void main(String[] args) {

        Song song = SongFactory.createSong(1, "Imagine", 183, "Rock", "2018");


        SongHelper.printSongDetails(song);
    }
}