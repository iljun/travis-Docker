package com.iljun.travisdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravisDockerApplication.class, args);
    }

    @GetMapping("/")
    public String sample() {
        return "travis && Docker";
    }
}
