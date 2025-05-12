package com.example.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicioApplication.class, args);
	}

	//http://localhost:8080/hello?name=Kauan
	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue = "World") String name){
		return String.format("hello %s", name);
	}

}
