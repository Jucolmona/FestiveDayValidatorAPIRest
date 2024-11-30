package com.example.festive_day_validator.api.domain.services;

import java.util.List;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.entities.TipoEntity;

public interface ITipoService {

    public List<TipoEntity> list();
    public TipoEntity getById(int id);
    public List<TipoEntity> searhByName(String name);
}
