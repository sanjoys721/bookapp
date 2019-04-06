package com.darts.ip.bookapp.repository;

import com.darts.ip.bookapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
}