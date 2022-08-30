package com.example.demojpatest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJpaTestApplicationTests {
    @Autowired
    BookStoreRepository bookStoreRepository;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void contextLoads() {
        BookStore bookStore = new BookStore();
        bookStore.setName("시애틀 책방");
        bookStoreRepository.save(bookStore);

        Book book = new Book();
        book.setTitle("JPA 공부");
        bookStore.add(book);
        bookRepository.save(book);
    }
}
