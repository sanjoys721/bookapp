package com.darts.ip.bookapp.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Embeddable


public class Review {

    private String reviewerName;
    private String content;
    private double rating;
    private String reviewDate;

    public Review() {}
}
