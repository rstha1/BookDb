package com.example.book.controller;

import com.example.book.domain.Book;
import com.example.book.domain.Library;
import com.example.book.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
   private LibraryService libraryService;

    @GetMapping("/getListOfBooks/{libraryId}")
    public List<Book> getAllBooks(@PathVariable int libraryId){
       return libraryService.getAllBooks(libraryId);
    }

    @PostMapping("/addBook/{libraryId}")
    public void addBook(@RequestBody Book book, @PathVariable int libraryId){
        libraryService.addBook(book, libraryId);
    }

    @PostMapping("/addListOfBooks/{libraryId}")
    public void addListOfBooks (@RequestBody List<Book> books, @PathVariable int libraryId){
        libraryService.addListOfBooks(books, libraryId);
    }

    @PostMapping("/addLibrary")
    public void addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
    }
}
