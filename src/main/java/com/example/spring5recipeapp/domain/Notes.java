package com.example.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Notes extends BaseEntity {

    @ToString.Exclude
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
