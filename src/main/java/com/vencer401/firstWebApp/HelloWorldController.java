package com.vencer401.firstWebApp;

import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value="/reverse", method = RequestMethod.GET)
    public @ResponseBody String getReverse(@RequestParam("sentence") String sentence){
        StringBuilder reversed = new StringBuilder();
        String[] split = sentence.split(" ");
        for(int i = split.length - 1; i >= 0; i--){
            reversed.append(split[i]);
            if(i < split.length - 2) reversed.append(" "); // insert space after word append but not last word
        }

        return reversed.toString();
    }
}
