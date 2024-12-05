package dev.mspilari.spring_app_server.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/hello-world")
public class HelloWorld {

    @GetMapping()
    @CircuitBreaker(name = "helloWorldCircuitBreaker", fallbackMethod = "fallbackHelloWorld")
    public ResponseEntity<Map<String, String>> helloWorld() {

        if (Math.random() < 0.5) {
            throw new RuntimeException("Service Unavailable");
        }
        return ResponseEntity.ok().body(Map.of("message", "Hello world from: " + System.getenv("SERVER_NAME")));
    }

    public ResponseEntity<Map<String, String>> fallbackHelloWorld(Throwable t) {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of("message",
                        "Fallback response: " + System.getenv("SERVER_NAME") + " service temporarily unavailable."));
    }

}
