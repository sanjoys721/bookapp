package com.darts.ip.bookapp.service;


import com.darts.ip.bookapp.domain.Book;
import com.darts.ip.bookapp.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBook(String title) {
        return this.bookRepository.findById(title);
    }

    public void save(List<Book> books) {

        for(Book book: books) {
            this.bookRepository.save(book);
        }
    }
}
