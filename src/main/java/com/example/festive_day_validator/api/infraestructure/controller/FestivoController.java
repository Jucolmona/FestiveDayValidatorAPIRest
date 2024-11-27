package com.example.festive_day_validator.api.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.festive_day_validator.api.domain.entities.FestivoEntity;
import com.example.festive_day_validator.api.domain.repositories.IFestivoRepository;
import com.example.festive_day_validator.api.domain.services.IFestivoService;

@RestController
public class FestivoController {
    @Autowired
    private IFestivoService festivoService;

    @Autowired
    private IFestivoRepository festivoRepository;

    @GetMapping("/festivos")
    public ResponseEntity<List<FestivoEntity>> listFestivos() {
        List<FestivoEntity> festivos = festivoService.listFestiveDays();
        return ResponseEntity.ok(festivos);
    }
    
    @GetMapping("/festivos/tipo")
    public ResponseEntity<List<FestivoEntity>> findByType(@RequestParam String tipo) {
        List<FestivoEntity> festivos = festivoRepository.findByTypeFestive(tipo);
        return ResponseEntity.ok(festivos);
    }
}
