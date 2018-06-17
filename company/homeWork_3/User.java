package com.company.homeWork_3;

import java.util.ArrayList;

public class User {
    private final String name;
    private final ArrayList<Playlist> playlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createPlaylist(String playlist) {
        playlists.add(new Playlist(playlist));
    }

    public Playlist findByTitle(String title) {
        for (Playlist playlist : playlists) {
            if (title.equals(playlist.getTitle())) {
                return playlist;
            }
        }
        return null;
    }

    public void addSongToPlaylist(String playlist, Song song) {
        findByTitle(playlist).addSong(song);
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", playlists=" + playlists +
                '}';
    }
}
