package com.vencer401.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello, world!";
    }

    @GetMapping("/hello/{name}")
    public String getHelloToMe(@PathVariable String name){
        return "Hello, " + name;
    }

    @GetMapping("/capitalize/{name}")
    public String getCapitalization(@PathVariable String name){
        return name.toUpperCase();
    }

    @GetMapping("/reverse?sentence={sentence}")
    public String getReverse(@PathVariable String sentence){
        StringBuilder reversed = new StringBuilder();
        String[] split = sentence.split(" ");
        for(int i = split.length - 1; i <= split.length; i--){
            reversed.append(split[i]);
        }

        return reversed.toString();
    }
}
