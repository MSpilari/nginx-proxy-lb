package dev.mspilari.spring_app_server.controllers;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {

    @GetMapping()
    public ResponseEntity<Map<String, String>> helloWorld() {

        return ResponseEntity.ok().body(Map.of("message", "Hello world from: " + System.getenv("SERVER_NAME")));
    }

}
