package com.darts.ip.bookapp;

import com.darts.ip.bookapp.domain.Book;
import com.darts.ip.bookapp.service.BookService;
import com.darts.ip.bookapp.service.BookServiceImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class BookappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(BookService bookService){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Book>> typeReference = new TypeReference<List<Book>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/test.json");
			try {
                List<Book> books = mapper.readValue(inputStream,typeReference);

					bookService.save(books);
				System.out.println("Books Saved!");
			} catch (IOException e){
				System.out.println("Unable to save books: " + e.getMessage());
			}
		};
	}

}
