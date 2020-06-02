package com.example.spring5recipeapp.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotFoundException extends RuntimeException {

    public NotFoundException(String expectedUomNotFound) {
        log.error(expectedUomNotFound);
    }
}
