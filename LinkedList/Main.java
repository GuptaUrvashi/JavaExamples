package com.urvashigupta;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("The E.N.D", "Black Eyed Peas");
        album.addSong("Lets get started", 4.6);
        album.addSong("My humps", 4.22);
        album.addSong("I gotta feeling", 4.54);
        album.addSong("Boom boom pow", 4.12);
        album.addSong("Imma be", 3.56);
        album.addSong("Meet me halfway", 5.22);
        albums.add(album);

        album = new Album("Hybrid Theory", "Linkin Park");
        album.addSong("One step close", 4.32);
        album.addSong("Crawling", 4.42);
        album.addSong("Papercut", 4.11);
        album.addSong("In the end", 6.00);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Imma be", playList);
        albums.get(0).addToPlaylist("Meet me halfway", playList);
        albums.get(0).addToPlaylist("My humps", playList);
        albums.get(0).addToPlaylist("Speed King", playList); //no song
        albums.get(0).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist("In the end", playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(32, playList);// no track of 32

        play(playList);

    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
        }/*else{
            System.out.println("Now Playing, " +listIterator.next().toString());
        }*/
        printMenu();
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing, " +listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing, " +listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }

                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing, " +listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now playing, " +listIterator.next().toString());
                            forward=true;
                        }
                        else{
                            System.out.println("We have reached end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing, " +listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing, " +listIterator.previous());
                        }
                    }
                    break;
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n Press");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - replay the current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - to remove a song from the playlist");
        System.out.println("6 - print available actions");

    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=========================");

    }




}
