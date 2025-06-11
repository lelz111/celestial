package com.example.Post.Test.Day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class PostTestDay1Application {

	public static void main(String[] args) {
		SpringApplication.run(PostTestDay1Application.class, args);
	}

	@GetMapping("/books")
	public String getBooks(@RequestParam(defaultValue = "Books") String bookName){
		return String.format("tes %s!",bookName);
	}

	@PostMapping("/books")
	public String postBooks(@RequestBody BooksRequest request) {
		return String.format("Books Added to %s! ", request.getBookName());
	}

	@PutMapping("/books/{id}")
	public String putBooks(@RequestBody BooksRequest request) {
		return String.format("Books Updated to %s! ", request.getBookName());
	}

	@DeleteMapping("/books/{id}")
	public String deleteBooks(@RequestParam String bookName) {
		return String.format("Books Deleted for %s! ", bookName);
	}


}
