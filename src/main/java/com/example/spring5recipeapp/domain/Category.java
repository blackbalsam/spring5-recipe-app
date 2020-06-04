package com.example.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode(exclude = {"recipes"})
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends BaseEntity {

    private String description;

    @ToString.Exclude
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
