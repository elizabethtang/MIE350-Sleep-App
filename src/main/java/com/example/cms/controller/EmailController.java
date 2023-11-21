package com.example.cms.controller;


import com.example.cms.model.entity.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class EmailController {
    @Autowired
    private final EmailRepository repository;


    public EmailController(EmailRepository repository) {
        this.repository = repository;
    }
}
