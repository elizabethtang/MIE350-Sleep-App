package com.example.cms.model.repository;

import com.example.cms.model.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository< Recommendation, Long> {
    //TODO

    @Query(value = "select * from recommendations where " +
            "recommendationId = (SELECT max(r.recommendationId) FROM RECOMMENDATIONS r INNER JOIN USERS u ON u.username = r.username where "
            + "u.username = '%', :searchTerm, '%')"
            , nativeQuery = true)
    List<Recommendation> getRecentRecommendation(@Param("searchTerm") String searchTerm);
}

