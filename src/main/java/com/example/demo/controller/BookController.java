package com.example.demo.controller;

import com.example.demo.service.BookService;
import com.example.demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

//    @Autowired
//    private BookService bookService;

//    @PostConstruct
//    public void setUp() {
//        bookService.insertBooks(Arrays.asList(new Book(1, "Spring", "A1", 100),
//                new Book(2, "Java", "A2", 110)));
//    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(Arrays.asList(new Book(1, "Spring", "A1", 100),
                new Book(2, "Java", "A2", 110)));
    }
}
