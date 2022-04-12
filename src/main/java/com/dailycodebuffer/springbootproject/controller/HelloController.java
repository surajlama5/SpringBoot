package com.dailycodebuffer.springbootproject.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping
    public String helloWorld() {
        return "Welcome to Daily Code Buffer";
    }

    @PutMapping
    public String update() {
        return "Welcome to Daily Code Buffer";
    }
    @PostMapping
    public String helloWorld1() {
        return "Welcome to Daily Code Buffer";
    }
    @DeleteMapping
    public String delete() {
        return "Welcome to Daily Code Buffer";
    }
}
//restful apis to create end-to-end post api, get