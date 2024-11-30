package com.example.festive_day_validator.api.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@RestController
@RequestMapping("/api/festivoValidator")
@CrossOrigin(origins = "http//localhost:8082")
public class FestivoController {

    private IFestivoService service;

    public FestivoController(IFestivoService service){
        this.service = service;
    }

    
  
}
