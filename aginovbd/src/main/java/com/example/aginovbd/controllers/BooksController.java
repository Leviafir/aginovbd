package com.example.aginovbd.controllers;

import com.example.aginovbd.entities.Books;
import com.example.aginovbd.interfaces.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/books")
    public List<Books> retrieveAllBooks() { return booksRepository.findAll(); }
}
