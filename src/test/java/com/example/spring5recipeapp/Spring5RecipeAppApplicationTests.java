package com.example.spring5recipeapp;

import com.example.spring5recipeapp.controllers.IndexController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Spring5RecipeAppApplicationTests {

	@Autowired
	private IndexController indexController;

	@Test
	void contextLoads() throws Exception {
		assertThat(indexController).isNotNull();
	}

}
