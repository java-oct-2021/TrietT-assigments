package com.example.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@RequestMapping("/")
	public String hello()
	{
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/coding")
	public String coding()
	{
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python()
	{
		return "Python/Django was awesome!";
	}
	@RequestMapping("/python")
	public String java()
	{
		return "Java/Spring is better!";
	}
}
