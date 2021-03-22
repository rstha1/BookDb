package com.example.book.service;

import com.example.book.domain.Book;
import com.example.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public void saveBook(Book book) {
        bookRepository.save(book);

    }
}
