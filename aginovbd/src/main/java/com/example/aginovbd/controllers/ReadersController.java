package com.example.aginovbd.controllers;

import com.example.aginovbd.entities.Readers;
import com.example.aginovbd.interfaces.ReadersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadersController {

    @Autowired
    private ReadersRepository readersRepository;

    @GetMapping("/readers")
    public List<Readers> retrieveAllReaders () { return readersRepository.findAll(); }

}
