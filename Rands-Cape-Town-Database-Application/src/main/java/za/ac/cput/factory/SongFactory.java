package za.ac.cput.factory;

import za.ac.cput.domain.Song;

public class SongFactory {
    public static Song createSong(int songID, String songTitle, int songDuration, String songGenre, String songYear) {
        return new Song.Builder()
                .setSongID(songID)
                .setSongTitle(songTitle)
                .setSongDuration(songDuration)
                .setSongGenre(songGenre)
                .setSongYear(songYear)
                .build();
    }
}

