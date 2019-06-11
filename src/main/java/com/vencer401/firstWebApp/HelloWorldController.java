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
}
