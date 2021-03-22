package com.example.book.controller;

import com.example.book.domain.Book;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public void saveBook(@RequestBody Book book){
        bookService.saveBook(book);

    }



}
