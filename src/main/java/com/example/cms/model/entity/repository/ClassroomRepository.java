package com.example.cms.model.entity.repository;

import com.example.cms.model.entity.CourseMark;
import com.example.cms.model.entity.CourseMarkKey;
import com.example.cms.model.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassroomRepository extends JpaRepository< Classroom, String> {

}
