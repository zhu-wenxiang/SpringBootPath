package org.example.springboot.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @GetMapping("/robot.txt")
    public ResponseEntity<String> robot(){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("503");
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
