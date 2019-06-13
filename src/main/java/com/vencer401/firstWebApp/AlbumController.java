package com.vencer401.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "allAlbums";
    }

    @GetMapping("/albums/add")
    public String addAlbums() {
        return "addAlbum";
    }

    @PostMapping("/albums")
    public RedirectView addGreeting(@RequestParam String title, @RequestParam String artist,
                                    @RequestParam String imageUrl, @RequestParam String length ,@RequestParam String songCount) {
        Album album;
        try{
            album = new Album(title,artist,Integer.parseInt(songCount),Integer.parseInt(length),imageUrl);
        }catch(NumberFormatException e){
            e.printStackTrace();
        return new RedirectView("/albums");
        }

        albumRepository.save(album);
        return new RedirectView("/albums");
    }

}
