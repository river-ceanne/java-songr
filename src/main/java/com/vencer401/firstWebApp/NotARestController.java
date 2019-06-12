package com.vencer401.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotARestController {

//
//    @GetMapping("/notarestcontroller")
//    public String getHelloWorld(){
//        return "hello";
//    }

    @GetMapping("/notarestcontroller")
    public String getHelloWorldWithName(Model model){

        String[] names = new String[]{"Bubbles","Blossom","Buttercup"} ;

//        model.addAttribute("name","Reina");
        model.addAttribute("names",names);

        return "hello";
    }
}
