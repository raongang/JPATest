package com.example.demojpatest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    private String isbn;
    private String title;

    @ManyToOne
    private BookStore bookStore;

}
