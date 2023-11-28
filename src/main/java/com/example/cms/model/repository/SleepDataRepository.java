package com.example.cms.model.repository;

import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SleepDataRepository extends JpaRepository<SleepData, Long> {
    //TODO
// SleepDataRepository interface

    @Query(value = "SELECT * FROM sleepDatas s " +
            "INNER JOIN users u ON s.user_Username = u.username " +
            "WHERE u.username = :username " +
            "AND PARSEDATETIME(CONCAT(s.startYear, '-', LPAD(s.startMonth, 2, '0'), '-', LPAD(s.startDay, 2, '0')), 'yyyy-MM-dd') >= :startDate " +
            "AND PARSEDATETIME(CONCAT(s.endYear, '-', LPAD(s.endMonth, 2, '0'), '-', LPAD(s.endDay, 2, '0')), 'yyyy-MM-dd') <= :endDate " +
            "ORDER BY PARSEDATETIME(CONCAT(s.startYear, '-', LPAD(s.startMonth, 2, '0'), '-', LPAD(s.startDay, 2, '0')), 'yyyy-MM-dd') ASC",
            nativeQuery = true)
    List<SleepData> sleepDataDuration(
            @Param("username") String username,
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate
    );











    @Query(value = "select * from (USERS u INNER JOIN sleepDatas s ON u.username = s.user_Username) where " +
            "ActivityID = '%', :sleepDataId, '%' AND user_Username = '%', :username, '%' ", nativeQuery = true)
    List<SleepData> getReferenceById(@Param("username") String username, @Param("sleepDataId") long sleepDataId);

    /*
    @Modifying
    @Transactional

    @Query(value = "UPDATE marks c SET c.mark = c.mark + 5 WHERE courseCode = :code", nativeQuery = true)
    void increaseFive(@Param("code") String code);

     */


}
