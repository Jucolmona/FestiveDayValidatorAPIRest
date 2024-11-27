package com.example.festive_day_validator.api.infraestructure.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.repositories.ITipoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@Service
public class FestiveService implements IFestivoService{
    
    @Autowired
    private IFestivoRepository festivoRepository;

    @Autowired
    private ITipoRepository tipoRepository;

    public FestiveService(){}

    public FestiveService(IFestivoRepository fr, ITipoRepository tr){
        this.festivoRepository = fr;
        this.tipoRepository = tr;
    }

    @Override
    public List<FestivoEntity> listFestiveDays() {
        return festivoRepository.findAll();
    }

}
