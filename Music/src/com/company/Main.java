package com.company;

import model.Artist;
import model.Datasource;
import model.SongArtist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Datasource datasource = new Datasource();
            if(!datasource.open()) {
                System.out.println("Can't open datasource");
                return;
            }

            List<Artist> artists = datasource.queryArtists(5);
            if(artists == null) {
                System.out.println("No artists!");
                return;
            }

            for(Artist artist : artists) {
                System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
            }

            List<String> albumsForArtists = datasource.querryAlbumsForArtist("Carole King",
                                                  Datasource.ORDER_BY_ASC);

            for (String album: albumsForArtists){
                System.out.println(album);
            }

            List<SongArtist> songArtists = datasource.querryArtistForSong("Go Your Own Way", Datasource.ORDER_BY_ASC);

            if (songArtists == null){
                System.out.println("Couldn't find the artist for the song.");
                return;
            }

            for (SongArtist artist: songArtists){
                System.out.println("Artist name= " + artist.getArtistName() +
                        " Album name= " + artist.getAlbumName() +
                        " Track= " + artist.getTrack());
            }
            datasource.querrySongsMetaData();

            int count = datasource.getCount(Datasource.TABLE_SONGS);
            System.out.println("The number of songs is: " + count);

            datasource.createViewForSongArtist();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a song name to query: ");
            String title = scanner.nextLine();


            songArtists = datasource.querySongInfoView(title);
            if(songArtists.isEmpty()) {
                System.out.println("Couldn't find the artist for the song");
                return;
            }

            for(SongArtist artist : songArtists) {
                System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                        " Album name = " + artist.getAlbumName() +
                        " Track number = " + artist.getTrack());
            }

            datasource.insertSong("Toch Of Grey", "Greateful Dead", "In The Dark", 1);


            datasource.close();
        }
}
