package com.example.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UnitOfMeasure extends BaseEntity {

    private String description;
}
