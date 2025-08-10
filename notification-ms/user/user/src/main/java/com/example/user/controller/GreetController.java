package com.example.user.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Greet (No Login Required)";
    }

    @GetMapping("/secure")
    public String secure() {
        return "This is a secure endpoint. You are logged in!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is an admin area. Authentication required!";
    }
}
