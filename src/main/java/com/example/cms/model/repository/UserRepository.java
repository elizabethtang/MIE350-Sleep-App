package com.example.cms.model.repository;

import com.example.cms.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "select * from users u " +
            "where lower(u.firstName) like lower(concat('%', :searchTerm, '%')) " +
            "or lower(u.lastName) like lower(concat('%', :searchTerm, '%'))", nativeQuery = true)
    List<User> search(@Param("searchTerm") String searchTerm);

    @Query(value = "select * from users u " +
            "where lower(u.username) like lower(concat('%', :username, '%')) " +
            "and lower(u.password) like lower(concat('%', :password, '%'))", nativeQuery = true)
    User findById(String username, String password);

    @Query(value = "SELECT COUNT(*) FROM users u WHERE lower(u.username) = lower(:username)", nativeQuery = true)
    int existsByUsername(@Param("username") String username);


    /*
    @Query(value = "select * from students where " +
            "id IN (SELECT s.id FROM STUDENTS s INNER JOIN MARKS m ON s.id = m.studentID " +
            "group by s.id HAVING AVG(Mark) >= 90)", nativeQuery = true)
    List<Student> findTopStudents();

     */

}
