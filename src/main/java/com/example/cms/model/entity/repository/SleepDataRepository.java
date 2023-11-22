package com.example.cms.model.entity.repository;

import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SleepDataRepository extends JpaRepository<SleepData, Long> {
    List<SleepData> dailySleep(String username, String start, String end);

    
    /*
    @Modifying
    @Transactional

    @Query(value = "UPDATE marks c SET c.mark = c.mark + 5 WHERE courseCode = :code", nativeQuery = true)
    void increaseFive(@Param("code") String code);

     */


}
