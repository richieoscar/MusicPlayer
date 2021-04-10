package com.richieoscar.musicapp.model;

public class Song {
    private String title;
    private String artist;
    private String albumArt;

    public Song(String title, String artist, String albumArt) {
        this.title = title;
        this.artist = artist;
        this.albumArt = albumArt;
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }
}
