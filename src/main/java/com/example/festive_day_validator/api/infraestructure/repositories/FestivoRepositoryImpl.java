package com.example.festive_day_validator.api.infraestructure.repositories;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class FestivoRepositoryImpl extends SimpleJpaRepository<FestivoEntity, Integer> implements IFestivoRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    public FestivoRepositoryImpl(EntityManager em){
        super(FestivoEntity.class, em);
        this.entityManager = em;
    }

    @Override
    public List<FestivoEntity> findByTypeFestive(String type) {
        //throw new UnsupportedOperationException("Unimplemented method 'findByTypeFestive'");
        TypedQuery<FestivoEntity> query = entityManager.createNamedQuery(type, null);
        return query.getResultList();
    }
}
