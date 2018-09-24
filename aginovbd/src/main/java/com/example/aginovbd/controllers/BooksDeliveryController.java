package com.example.aginovbd.controllers;

import com.example.aginovbd.entities.BooksDelivery;
import com.example.aginovbd.interfaces.BooksDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksDeliveryController {

    @Autowired
    private BooksDeliveryRepository booksDeliveryRepository;

    @GetMapping("/delivery")
    public List<BooksDelivery> retrieveAllDeliveries() { return booksDeliveryRepository.findAll(); }

}
