package com.example.festive_day_validator.api.infraestructure.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Table(name = "tipo")
public class TipoEntity {

    @Id
    @Column(name="id")
    private int id;

    @column(name="tipo", length=100, unique=true)
    private String type;

    public TipoEntity(){
    }

    public TipoEntity(String type){
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
