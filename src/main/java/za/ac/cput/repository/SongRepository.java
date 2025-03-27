package za.ac.cput.repository;

import za.ac.cput.domain.Song;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {
    private List<Song> songList;

    public SongRepository() {
        this.songList = new ArrayList<>();
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public List<Song> getAllSongs() {
        return new ArrayList<>(songList); // Return a copy to prevent modification
    }

    public Song getSongByID(int songID) {
        for (Song song : songList) {
            if (song.getSongID() == songID) {
                return song;
            }
        }
        return null; // Return null if not found
    }

    public void removeSong(int songID) {
        songList.removeIf(song -> song.getSongID() == songID);
    }
}