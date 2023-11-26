package com.example.cms.model.repository;

import com.example.cms.model.entity.Activity;
import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SleepDataRepository extends JpaRepository<SleepData, Long> {
    //TODO
// SleepDataRepository interface

    @Query(value = "SELECT * FROM sleepDatas s " +
            "INNER JOIN users u ON s.user_Username = u.username " +
            "WHERE u.username = :username " +
            "AND PARSEDATETIME(CONCAT(s.startDay, '/', s.startMonth, '/', s.startYear), 'd/M/yyyy') >= PARSEDATETIME(:start, 'd/M/yyyy') " +
            "AND PARSEDATETIME(CONCAT(s.endDay, '/', s.endMonth, '/', s.endYear), 'd/M/yyyy') <= PARSEDATETIME(:end, 'd/M/yyyy')",
            nativeQuery = true)
    List<SleepData> sleepDataDuration(
            @Param("username") String username,
            @Param("start") String start,
            @Param("end") String end
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
