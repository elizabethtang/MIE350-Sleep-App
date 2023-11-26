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

    @Query(value = "SELECT * FROM recommendations r " +
            "WHERE r.recommendationId = (SELECT MAX(rr.recommendationId) " +
            "                             FROM recommendations rr " +
            "                             INNER JOIN users u ON u.username = rr.username " +
            "                             WHERE u.username LIKE %:searchTerm%)"
            , nativeQuery = true)
    Recommendation getRecentRecommendation(@Param("searchTerm") String searchTerm);
}

