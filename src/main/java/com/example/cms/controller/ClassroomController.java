package com.example.cms.controller;

import com.example.cms.controller.exceptions.ClassroomNotFoundException;
import com.example.cms.model.entity.Classroom;
import com.example.cms.model.entity.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ClassroomController {
    @Autowired
    private final ClassroomRepository repository;

    public ClassroomController(ClassroomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/classrooms")
    List<Classroom> retrieveAllClassrooms() {
        return repository.findAll();
    }

    /* @PostMapping("/students")
     Student createStudent(@RequestBody Student newStudent) {
         return repository.save(newStudent);
     }
 */
    @GetMapping("/classrooms/{id}")
    Classroom retrieveClassroom(@PathVariable("id") String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ClassroomNotFoundException(id));
    }
}
/*
    @PutMapping("/students/{id}")
    Student updateStudent(@RequestBody Student newStudent, @PathVariable("id") Long studentId) {
        return repository.findById(studentId)
                .map(student -> {
                    student.setFirstName(newStudent.getFirstName());
                    student.setLastName(newStudent.getLastName());
                    return repository.save(student);
                })
                .orElseGet(() -> {
                    newStudent.setId(studentId);
                    return repository.save(newStudent);
                });
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable("id") Long studentId) {
        repository.deleteById(studentId);
    }
*/