package com.company.homeWork_3;

import java.util.ArrayList;

public class Playlist {
    private final String title;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public long getTotalLength() {
        long totalLength = 0;
        for (Song song : songs) {
            totalLength += song.getLength();
        }
        return totalLength;
    }

    public ArrayList<Song> findByTitlePart(String titlePart){
        ArrayList<Song>titlePartArray = new ArrayList<>();
        for(Song song:songs){
            if(titlePart.equals(song.getTitle())){
                titlePartArray.add(song);
            }
        }
        return titlePartArray;
    }
    public ArrayList<Song> findByAuthor(String author) {
        ArrayList<Song> findByAuthor = new ArrayList<>();
        for (Song song : songs) {
            if (author.equals(song.getAuthor())) {
                findByAuthor.add(song);
            }
        }
        return findByAuthor;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }
}
