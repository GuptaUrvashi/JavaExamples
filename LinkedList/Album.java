package com.urvashigupta;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song (title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        /*for(int i=0; i < this.songs.size(); i++){
            if(this.songs.get(i).getTitle().equals(title)){
                System.out.println("Song title already exists");
            }
        }*/ // OR use:
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " +title + " is not in this album");
        return false;
    }
}
