package com.example.ci_cd_pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdPipelineApplication {
    @GetMapping
    public String index() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(CiCdPipelineApplication.class, args);
    }

//    echo "# simple_git_actions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/PraneethGanesh/simple_git_actions.git
//    git push -u origin main

}
