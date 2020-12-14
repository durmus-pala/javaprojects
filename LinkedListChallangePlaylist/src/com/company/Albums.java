package com.company;

import java.util.ArrayList;

public class Albums {
    private String albumName;
   private ArrayList<Songs> albums;

    public Albums(String albumName) {
        this.albumName = albumName;
        this.albums = new ArrayList<Songs>();

    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Songs> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Songs> albums) {
        this.albums = albums;
    }
    public boolean addNewSong(Songs newSong) {
        if(findSong(newSong) >= 0) {
            System.out.println("This is already on file");
            return false;
        }

        albums.add(newSong);
        return true;

    }
    private int findSong(Songs song) {
        return this.albums.indexOf(song);
    }

    private int findSong(String songName) {
        for(int i=0; i<this.albums.size(); i++) {
            Songs song = this.albums.get(i);
            if(song.getSongName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }
    //    String[] adibendesakli = {"ud taksimi" , "tutuklu", "kaderim", "hazan", "erkek güzeli", "kusura bakma", "ruhuma asla",
//            "adı bende saklı", "ben sevdalı sen belalı", "şimal yıldızı"};
//
//    String[] deliveren = {"deli veren", "oh oh", "kahpe kader", "keskin bıçak", "rumeli havası", "gidiyorum bu şehirden",
//            "yine mi çiçek", "hoşgeldin", "sarı odalar"};
//
//    String[] kaybolanyillar = {"kaybolan yıllar", "neye yarar"};
}
