package com.bookstore.book_api;

import org.springframework.boot.SpringApplication;   //helper class that runs the application
import org.springframework.boot.autoconfigure.SpringBootApplication;   //provide convenience annotation

@SpringBootApplication   //tells Spring Boot to start scanning from this class's package
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
