package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Albums album1 = new Albums("deliveren");
        Songs song1 = new Songs("hosgeldin", 3.5);
        Songs song2 = new Songs("sari odalar", 4.0);

        Albums album2 = new Albums("adi bende sakli");
        Songs song3 = new Songs("tutuklu", 4.3);
        Songs song4 = new Songs("simal yildizi", 3.8);

        album1.addNewSong(song1);
        album1.addNewSong(song2);

        album2.addNewSong(song3);
        album2.addNewSong(song4);

        LinkedList<String> playList = new LinkedList<String>();
        addPlaylist(playList, song1.getSongName());
        addPlaylist(playList, song2.getSongName());
        addPlaylist(playList, song3.getSongName());
        addPlaylist(playList, song4.getSongName());


        play(playList);
    }

    private static void addPlaylist(LinkedList<String> linkedList, String newSongName) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        stringListIterator.add(newSongName);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()){
            System.out.println( "--> " + i.next());
        }
        System.out.println("================================");
    }

    private static void play(LinkedList<String> songs){
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = songs.listIterator();

        if(songs.isEmpty()){
            System.out.println("No song in the playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Music over!");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list!!");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("now replaying: " + listIterator.previous());
                            goingForward = false;
                        }else{
                            System.out.println("We are at the start of the list.");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying: " + listIterator.next());
                            goingForward = true;
                        }else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(songs);
                    break;
                case 5:
                    if(songs.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing: " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing: " + listIterator.previous());
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
        System.out.println("Available actions.\nPress: ");
        System.out.println("0 -  quit.\n" +
                "1 -  skip forward to next song.\n" +
                "2 -  skip bacward to previous song.\n" +
                "3 -  replay current song.\n" +
                "4 -  list the songs in the playlist.\n" +
                "5 -  remove current song from the list.\n" +
                "6 -  print available actions.");
    }
}

