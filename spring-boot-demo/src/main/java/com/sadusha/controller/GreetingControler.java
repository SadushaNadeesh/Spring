package com.sadusha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControler {
    @RequestMapping("/")
    public String Greeting(){
        return "<h1> Spring boot demo...</h1>";
    }
}
