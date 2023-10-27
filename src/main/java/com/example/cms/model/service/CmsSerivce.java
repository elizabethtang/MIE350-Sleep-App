package com.example.cms.model.service;

import com.example.cms.model.entity.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class CmsSerivce {

    public CmsSerivce(StudentRepository studentRepository) {
    }
}
