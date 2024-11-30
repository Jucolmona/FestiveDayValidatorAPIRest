package com.example.festive_day_validator.api.infraestructure.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@Service
public class FestiveService implements IFestivoService{

    private static final Logger logger = LoggerFactory.getLogger(FestiveService.class);  

    private IFestivoRepository repository;

    public FestiveService(IFestivoRepository repository){
        this.repository = repository;
    }

    @Override
    public List<FestivoEntity> list() {
        logger.info("List all festive days");
        List<FestivoEntity> festivos = repository.findAll(Sort.by("name"));
        logger.info("Found {} festive days", festivos.size());
        return festivos;
    }

    @Override
    public FestivoEntity getById(int id) {
        logger.info("Getting By Id: " + Integer.toString(id));
        FestivoEntity festivo = repository.findById(id).isEmpty() ? null : repository.findById(id).get();
        logger.info("get {}", festivo);
        return festivo;
    }
}
