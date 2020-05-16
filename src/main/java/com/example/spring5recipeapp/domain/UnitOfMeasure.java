package com.example.spring5recipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class UnitOfMeasure extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
