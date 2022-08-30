package com.example.demojpatest;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class BookStore {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    //mappedBy - 연관관계 주인이 참조하는 변수명
    @OneToMany(mappedBy = "bookStore")
    private Set<Book> books = new HashSet<>();

    void add(Book book){
        book.setBookStore(this);
        this.books.add(book);
    }

}
