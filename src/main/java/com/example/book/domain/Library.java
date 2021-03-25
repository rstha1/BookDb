package com.example.book.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Library {

    @Id
    @GeneratedValue
    private int libraryId;
    private String name;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List <Book> books;

    public void setBooks(List<Book> books){
        this.books = books;

        for(Book b : books){
            b.setLibrary(this);
        }
    }

}
