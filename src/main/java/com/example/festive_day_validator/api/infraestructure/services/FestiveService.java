package com.example.festive_day_validator.api.infraestructure.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.repositories.ITipoRepository;

@Service
public class FestiveService  {
    
    @Autowired
    private IFestivoRepository festivoRepository;

    @Autowired
    private ITipoRepository tipoRepository;

}
