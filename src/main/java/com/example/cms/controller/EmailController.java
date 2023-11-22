//package com.example.cms.controller;
//
//import com.example.cms.model.entity.SleepData;
//import com.example.cms.model.repository.EmailRepository;
//import com.example.cms.model.service.EmailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/email")
//@CrossOrigin
//public class EmailController {
//
//    private final EmailRepository repository;
//
//    @Autowired
//    private EmailService emailService;
//
//    private boolean emailEnabled = true; // Variable to control email functionality
//
//    public EmailController(EmailRepository repository) {
//        this.repository = repository;
//    }
//
//    @PostMapping("/toggle")
//    public ResponseEntity<String> toggleEmailFunctionality(@RequestParam boolean enable) {
//        emailEnabled = enable;
//        String status = emailEnabled ? "Email functionality is enabled." : "Email functionality is disabled.";
//        return new ResponseEntity<>(status, HttpStatus.OK);
//    }
//
//    @PostMapping("/sendSleepUpdate")
//    public ResponseEntity<String> sendSleepUpdateEmail(@RequestBody SleepData sleepData) {
//        if (emailEnabled) {
//            // Prepare email content based on sleep data
//            String to = sleepData.getAppUser().getEmail(); // Assuming User has an email property
//            String subject = "Sleep Data Update";
//            String body = "New sleep data: " + sleepData.getSleepDetails();
//
//            // Send email using the EmailService
//            emailService.sendEmail(to, subject, body);
//
//            return new ResponseEntity<>("Email sent successfully.", HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>("Email functionality is disabled.", HttpStatus.OK);
//        }
//    }
//}
