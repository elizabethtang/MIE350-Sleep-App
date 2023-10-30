package com.example.cms.controller;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.Student;
import com.example.cms.model.entity.repository.CourseMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CourseMarkController {
    @Autowired
    private final CourseMarkRepository repository;

    public CourseMarkController(CourseMarkRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/marks")
    List<CourseMark> retrieveAllMarks() {
        return repository.findAll();
    }

    @PostMapping("/marks/increaseFive/{code}")

    List <CourseMark> increaseByFive ( @PathVariable("code") String crs_code){
        repository.increaseFive(crs_code); //update marks, returns nothing
        return repository.findAll(); //return all marks

    }

    }


