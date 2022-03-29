package za.co.myapplication.example.spring.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.myapplication.example.domain.dtos.customer.HelloWorldDto;

@RestController
@RequestMapping("/api/home")
public class HelloWorldController {

    //Added this config annotation, tried looking for a way to add this globally. is this possible
    @CrossOrigin()
    @GetMapping("/hello")
    public HelloWorldDto hello(){
        HelloWorldDto helloworld = new HelloWorldDto();
        helloworld.setMessage("Hello World");
        return helloworld;

    }
    @GetMapping("/")
    public String home(){
        return "HOME";
    }
}
