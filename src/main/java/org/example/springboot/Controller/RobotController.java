package org.example.springboot.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @GetMapping("/robots933456.txt")
    public ResponseEntity<String> robot(){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("503");
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/")
    public String homepage(){
        return "this is spring boot home page";
    }

    @PostMapping("/postit/{body}")
    public String postit(@PathVariable("body") String body){
        System.out.println(body);
        return "this is postit "+ body;
    }
}
