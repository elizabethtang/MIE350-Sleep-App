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

    @Query(value = "SELECT * FROM sleep_data s " +
            "INNER JOIN users u ON s.user_id = u.id " +
            "WHERE u.username = :username " +
            "AND STR_TO_DATE(s.start_date, '%d/%m/%y') >= STR_TO_DATE(:start, '%d/%m/%y') " +
            "AND STR_TO_DATE(s.end_date, '%d/%m/%y') <= STR_TO_DATE(:end, '%d/%m/%y')", nativeQuery = true)
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
