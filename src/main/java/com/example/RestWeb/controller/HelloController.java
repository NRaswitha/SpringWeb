package com.example.RestWeb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/printHello")
public class HelloController {

    @GetMapping("/hello")
    public String display()
    {
        return "Print Hello get mapping";
    }
    @PostMapping("/hello1")
    public String display1()
    {
        return "Print Hello post mapping";
    }
    @PutMapping("/hello2")
    public String display2()
    {
        return "Print Hello put mapping";
    }

    @DeleteMapping("/hello3")
    public String display3()
    {
        return "Print Hello delete mapping";
    }


}
