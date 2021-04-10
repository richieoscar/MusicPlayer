package com.richieoscar.musicapp.model;

import java.util.ArrayList;

public class MusicLibrary {
    private static ArrayList<PlayList> playList = new ArrayList<>();

    public static ArrayList<Song> AllSongs() {
        ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("Reckless", "Wizkid"));
        songsList.add(new Song("Pour Me Water", "Mr Eazi"));
        songsList.add(new Song("Location", "Burna Boy"));
        songsList.add(new Song("The Best", "Davido"));
        songsList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        songsList.add(new Song("Loved By You", "Justin Bieber ft Burna Boy"));
        songsList.add(new Song("Godly", "Omay Lay"));
        songsList.add(new Song("There For You", "Simi"));
        songsList.add(new Song("African Giant", "Burna Boy"));
        songsList.add(new Song("Essence", "Wizkid ft Tems"));
        songsList.add(new Song("Damages", "Tems"));
        songsList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        songsList.add(new Song("Wap", "Card B"));
        songsList.add(new Song("Chun Li", "Nicki Minaj"));
        songsList.add(new Song("Forever Young", "Jay Z"));
        songsList.add(new Song("Grace", "Wizkid"));
        songsList.add(new Song("Ease Your Mind", "Wizkid"));
        return songsList;
    }

    public static ArrayList<Song> RecentSongs() {
        ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        songsList.add(new Song("Wap", "Card B"));
        songsList.add(new Song("Chun Li", "Nicki Minaj"));
        songsList.add(new Song("Forever Young", "Jay Z"));
        songsList.add(new Song("Grace", "Wizkid"));
        songsList.add(new Song("Ease Your Mind", "Wizkid"));
        songsList.add(new Song("Reckless", "Wizkid"));
        songsList.add(new Song("Pour Me Water", "Mr Eazi"));
        songsList.add(new Song("Location", "Burna Boy"));
        songsList.add(new Song("The Best", "Davido"));
        songsList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        return songsList;
    }

    public static ArrayList<Song> BuyMusic() {
        ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        songsList.add(new Song("Loved By You", "Justin Bieber ft Burna Boy"));
        songsList.add(new Song("Godly", "Omay Lay"));
        songsList.add(new Song("There For You", "Simi"));
        songsList.add(new Song("African Giant", "Burna Boy"));
        songsList.add(new Song("Essence", "Wizkid ft Tems"));
        songsList.add(new Song("Damages", "Tems"));
        songsList.add(new Song("Reckless", "Wizkid"));
        songsList.add(new Song("Pour Me Water", "Mr Eazi"));
        songsList.add(new Song("Location", "Burna Boy"));
        songsList.add(new Song("The Best", "Davido"));
        songsList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        songsList.add(new Song("Wap", "Card B"));
        songsList.add(new Song("Chun Li", "Nicki Minaj"));
        songsList.add(new Song("Forever Young", "Jay Z"));
        songsList.add(new Song("Grace", "Wizkid"));
        songsList.add(new Song("Ease Your Mind", "Wizkid"));
        return songsList;
    }

    public static ArrayList<PlayList> PlayLists() {
        ArrayList<Song> travelPlayList = new ArrayList<>();
        travelPlayList.add(new Song("Reckless", "Wizkid"));
        travelPlayList.add(new Song("Pour Me Water", "Mr Eazi"));
        travelPlayList.add(new Song("Location", "Burna Boy"));
        travelPlayList.add(new Song("The Best", "Davido"));
        travelPlayList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        travelPlayList.add(new Song("Loved By You", "Justin Bieber ft Burna Boy"));
        travelPlayList.add(new Song("Godly", "Omay Lay"));
        travelPlayList.add(new Song("There For You", "Simi"));
        travelPlayList.add(new Song("African Giant", "Burna Boy"));
        travelPlayList.add(new Song("Essence", "Wizkid ft Tems"));
        travelPlayList.add(new Song("Damages", "Tems"));
        travelPlayList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        travelPlayList.add(new Song("Wap", "Card B"));
        travelPlayList.add(new Song("Chun Li", "Nicki Minaj"));
        travelPlayList.add(new Song("Forever Young", "Jay Z"));
        travelPlayList.add(new Song("Grace", "Wizkid"));
        travelPlayList.add(new Song("Ease Your Mind", "Wizkid"));

        ArrayList<Song> workOutPlayList = new ArrayList<>();
        workOutPlayList.add(new Song("Reckless", "Wizkid"));
        workOutPlayList.add(new Song("Pour Me Water", "Mr Eazi"));
        workOutPlayList.add(new Song("Location", "Burna Boy"));
        workOutPlayList.add(new Song("The Best", "Davido"));
        workOutPlayList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        workOutPlayList.add(new Song("Loved By You", "Justin Bieber ft Burna Boy"));
        workOutPlayList.add(new Song("Godly", "Omay Lay"));
        workOutPlayList.add(new Song("There For You", "Simi"));
        workOutPlayList.add(new Song("African Giant", "Burna Boy"));
        workOutPlayList.add(new Song("Essence", "Wizkid ft Tems"));
        workOutPlayList.add(new Song("Damages", "Tems"));
        workOutPlayList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        workOutPlayList.add(new Song("Wap", "Card B"));
        workOutPlayList.add(new Song("Chun Li", "Nicki Minaj"));
        workOutPlayList.add(new Song("Forever Young", "Jay Z"));
        workOutPlayList.add(new Song("Grace", "Wizkid"));
        workOutPlayList.add(new Song("Ease Your Mind", "Wizkid"));

        ArrayList<Song> readingPlayList = new ArrayList<>();
        readingPlayList.add(new Song("Reckless", "Wizkid"));
        readingPlayList.add(new Song("Pour Me Water", "Mr Eazi"));
        readingPlayList.add(new Song("Location", "Burna Boy"));
        readingPlayList.add(new Song("The Best", "Davido"));
        readingPlayList.add(new Song("Somebody Baby", "Peruzzi ft Davido"));
        readingPlayList.add(new Song("Loved By You", "Justin Bieber ft Burna Boy"));
        readingPlayList.add(new Song("Godly", "Omay Lay"));
        readingPlayList.add(new Song("There For You", "Simi"));
        readingPlayList.add(new Song("African Giant", "Burna Boy"));
        readingPlayList.add(new Song("Essence", "Wizkid ft Tems"));
        readingPlayList.add(new Song("Damages", "Tems"));
        readingPlayList.add(new Song("Loading", "Olamide ft BadBoytimz"));
        readingPlayList.add(new Song("Wap", "Card B"));
        readingPlayList.add(new Song("Chun Li", "Nicki Minaj"));
        readingPlayList.add(new Song("Forever Young", "Jay Z"));
        readingPlayList.add(new Song("Grace", "Wizkid"));
        readingPlayList.add(new Song("Ease Your Mind", "Wizkid"));

        playList.add(new PlayList("Travel", travelPlayList));
        playList.add(new PlayList("Reading", readingPlayList));
        playList.add(new PlayList("Work Out", workOutPlayList));
        return playList;
    }

}
