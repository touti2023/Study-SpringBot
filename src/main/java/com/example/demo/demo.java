package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@SpringBootApplication
public class demo {

    @RequestMapping(value = "/")
    public String gg() {
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(demo.class);
    }
}
