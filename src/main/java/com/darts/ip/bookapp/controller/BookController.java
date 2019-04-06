package com.darts.ip.bookapp.controller;

import com.darts.ip.bookapp.domain.Book;
import com.darts.ip.bookapp.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/books/")

public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("{title}")
    public Optional<Book> getBookDetails(@PathVariable String title) {
        return bookService.getBook(title);
    }


}
