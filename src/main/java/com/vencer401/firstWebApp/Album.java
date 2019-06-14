package com.vencer401.firstWebApp;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    //Create an Album model.
    //An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
    //A user should be able to see information about all the albums on the site.
    //A user should be able to add albums to the site.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int length;
    String imageUrl;
    @OneToMany(mappedBy = "album")
    List<Song> songs;


    public Album(){}

    public Album(String title, String artist, int songCount, int length, String imageUrl){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
