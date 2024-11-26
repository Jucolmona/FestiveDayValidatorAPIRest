package com.example.festive_day_validator.api.infraestructure.repositories;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FestivoRepositoryImpl 
extends SimpleJpaRepository<FestivoEntity, Integer>
implements IFestivoRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    public FestivoRepositoryImpl(EntityManager em){
        super(FestivoEntity.class, em);
        this.entityManager = em;
    }

}
