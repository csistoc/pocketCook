package com.example.pocketCook.dao;

import com.example.pocketCook.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    void deleteByRecipeId(Long recipeId);
}
