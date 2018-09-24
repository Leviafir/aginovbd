package com.example.aginovbd.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "books")
public class Books implements Serializable {

    @Id
    @Column(name = "id_books")
    private Long id_books;
    private Long library_code;
    private String book_description;
    private Long book_cost;

    @JsonIgnore
    @OneToMany(mappedBy = "books")
    private Collection<Books> books;

    public Books() {}

    public Long getId_books() {
        return id_books;
    }

    public Long getLibrary_code() {
        return library_code;
    }

    public String getBook_description() {
        return book_description;
    }

    public Long getBook_cost() {
        return book_cost;
    }

    public Collection<Books> getBooks() {
        return books;
    }

    public void setId_books(Long id_books) {
        this.id_books = id_books;
    }

    public void setLibrary_code(Long library_code) {
        this.library_code = library_code;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }

    public void setBook_cost(Long book_cost) {
        this.book_cost = book_cost;
    }

    public void setBooks(Collection<Books> books) {
        this.books = books;
    }
}
