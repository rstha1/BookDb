package com.example.book.service;

import com.example.book.domain.Book;
import com.example.book.domain.Library;
import com.example.book.repository.BookRepository;
import com.example.book.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(int libraryId) {
        Library library = libraryRepository.findById(libraryId).orElse(null);
        return library.getBooks();
    }

    public void addBook(Book book, int libraryId) {
        Library library = libraryRepository.findById(libraryId).orElse(null);
        book.setLibrary(library);
        bookRepository.save(book);

//        List<Book> bookList = library.getBooks();
//        bookList.add(book);
//        library.setBooks(bookList); // updating the list

    }

    public void addListOfBooks(List<Book> books, int libraryId) {
        Library library = libraryRepository.findById(libraryId).orElse(null);
        for (Book b: books) {
            b.setLibrary(library);
        }
        bookRepository.saveAll(books);

//        List<Book> bookList = library.getBooks();
//        for (int i = 0; i < books.size() ; i++) {
//            bookList.add(books.get(i));
//        }
//        library.setBooks(bookList);

    }

    public void addLibrary(Library library) {
        libraryRepository.save(library);
    }
}
