package com.example.book.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String author;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "libraryId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Library library;

}
