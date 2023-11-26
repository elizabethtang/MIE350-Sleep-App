package com.example.cms.controller;

import com.example.cms.model.entity.Email;
import com.example.cms.model.entity.Recommendation;
import com.example.cms.model.entity.SleepData;
import com.example.cms.model.entity.User;
import com.example.cms.model.repository.EmailRepository;
import com.example.cms.model.repository.UserRepository;
import com.example.cms.model.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {
    @Autowired
    private static EmailService emailService;
    @Autowired
    private final UserRepository repository;
    @Autowired
    private final EmailRepository emailRepository;

    public EmailController(UserRepository repository, EmailRepository emailRepository) {
        this.repository = repository;
        this.emailRepository = emailRepository;
    }

    @PostMapping("/emailToggle/{username}")
    public boolean toggleEmailFunctionality(@PathVariable String username, @RequestParam boolean enable) {
        User user = repository.getReferenceById(username);
        user.setEmailToggle(enable);
        repository.save(user);
        return enable;
    }

    void sendEmailWithRecommendation(String to, SleepData sleepData, Recommendation recommendation) {
        String subject = "Sleep Data and Recommendation Update";
        String body = "New sleep data: " + sleepData.getSleepDetails() +
                "\nSleep Recommendation: " + recommendation.getSleepAmount();

        Email email = new Email(null, body, sleepData.getUser(), recommendation);

        emailRepository.save(email);
        emailService.sendEmail(to, subject, body);
    }
}
