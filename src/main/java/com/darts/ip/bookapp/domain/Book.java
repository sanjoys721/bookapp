package com.darts.ip.bookapp.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private String title;
    private String author;
    private String publishedDate;
    private String isbn;

    @Embedded

    private Review reviews;

    public Book() {}
}
