package com.vencer401.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotARestController {


    @GetMapping("/notarestcontroller")
    public String getHelloWorld(){
        return "hello";
    }

    @GetMapping("/notarestcontroller/{name}")
    public String getHelloWorldWithName(){
        return "hello";
    }
}
