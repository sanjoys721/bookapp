package com.darts.ip.bookapp.service;

import com.darts.ip.bookapp.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Optional<Book> getBook(String title);
    public void save(List<Book> books);
}
