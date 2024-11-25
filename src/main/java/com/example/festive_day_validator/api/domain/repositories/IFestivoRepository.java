package com.example.festive_day_validator.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFestivoRepository extends JpaRepository<FestivoEntity, Integer> {
}

