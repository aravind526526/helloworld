package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return "Result of addition: " + num1 + " + " + num2 + " = " + result;
    }
}
