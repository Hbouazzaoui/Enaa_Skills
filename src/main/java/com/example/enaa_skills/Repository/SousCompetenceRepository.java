package com.example.enaa_skills.Repository;

import com.example.enaa_skills.Entity.SousCompetence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousCompetenceRepository extends JpaRepository<SousCompetence, Long> {

}
