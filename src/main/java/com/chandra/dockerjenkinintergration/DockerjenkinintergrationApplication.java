package com.chandra.dockerjenkinintergration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerjenkinintergrationApplication {

    @GetMapping("/")
    public String getMessage(){
        System.out.println("DockerjenkinintergrationApplication");
        System.out.println("Started");
        return "DockerjenkinintergrationApplication";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerjenkinintergrationApplication.class, args);
    }

}
