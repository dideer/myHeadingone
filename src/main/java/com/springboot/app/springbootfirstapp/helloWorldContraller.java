package com.springboot.app.springbootfirstapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldContraller {

    //GET HTTP METHOD
    //Http://localhost:8080/hello-world


    @GetMapping("/hello-world")
    public String helloworld(){

        return " Hello World";
    }

}
