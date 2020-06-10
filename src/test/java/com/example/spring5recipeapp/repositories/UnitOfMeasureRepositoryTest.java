package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.UnitOfMeasure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    public void findByDescription() {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        if (uomOptional.isPresent()) {
            UnitOfMeasure uom = uomOptional.get();

            assertEquals("Teaspoon", uom.getDescription());
        }
    }

    @Test
    public void findByDescriptionCup() {

        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
        if (uomOptional.isPresent()) {
            UnitOfMeasure uom = uomOptional.get();

            assertEquals("Cup", uom.getDescription());
        }
    }
}