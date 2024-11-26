package com.example.festive_day_validator.api.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoRepository extends JpaRepository<TipoEntity, Integer> {
    List<TipoEntity> findAll();
    Optional<TipoEntity> findById(Integer id);
}
