package com.example.pocketCook.dto;

import com.example.pocketCook.entity.RecipeIngredient;

import java.util.Set;

public class IngredientTestingDto {

    private Long ingredientId;

    private String name;

    private Set<RecipeIngredient> recipeIngredients;

    public IngredientTestingDto() { }

    public IngredientTestingDto(Long ingredientId, String name, Set<RecipeIngredient> recipeIngredients) {
        this.ingredientId = ingredientId;
        this.name = name;
        this.recipeIngredients = recipeIngredients;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(Set<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }
}
