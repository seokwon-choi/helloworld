package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class helloworld {

    @GetMapping("/hello")
    public String get_hello(){
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String get_name(@PathVariable(name="name") String Pathname){
        return Pathname;
    }
}
