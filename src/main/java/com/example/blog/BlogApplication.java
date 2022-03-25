package com.example.blog;

import org.springframework.boot.*;
// import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BlogApplication implements ApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	@RequestMapping(value = "/")
   	public String hello() {
      	return "I love you";
	}
	@Override
	// execute the code after the Spring Boot application started
   	public void run(ApplicationArguments arg0) throws Exception {
    	System.out.println("Hello World from Application Runner");
   	}
}
