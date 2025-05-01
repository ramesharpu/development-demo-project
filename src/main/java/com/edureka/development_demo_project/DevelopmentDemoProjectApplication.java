package com.edureka.development_demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevelopmentDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevelopmentDemoProjectApplication.class, args);
	}

	@GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello There!!! Welcome to my project.</h1>");
    }
}
