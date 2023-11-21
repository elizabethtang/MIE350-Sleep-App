package com.example.cms.model.entity.repository;

import com.example.cms.model.entity.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SleepDataRepository extends JpaRepository<SleepData, SleepDataKey> {
    SleepData getReferenceById(Long sleepDataId);

    boolean existsById(Long sleepDataId);

    void deleteById(Long sleepDataId);
    
    /*
    @Modifying
    @Transactional

    @Query(value = "UPDATE marks c SET c.mark = c.mark + 5 WHERE courseCode = :code", nativeQuery = true)
    void increaseFive(@Param("code") String code);

     */


}
