package com.vencer401.firstWebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    // Create a Song model.
    //A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
    //Ensure that the relationship between Albums and Songs is appropriately set up.
    //A user should be able to see information about all the songs on the site.
    //A user should be able to view a page with data about one particular album.
    //A user should be able to add songs to an album.
    //A user should be able to see the songs that belong to an album when looking at that album.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int length;
    int trackNumber;
    Album album;

    public Song(){}

    public Song(String title,int length, int trackNumber, Album album){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

}

