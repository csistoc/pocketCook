package com.example.pocketCook.dto;

import com.example.pocketCook.entity.Ingredient;
import com.example.pocketCook.entity.Recipe;

public class TestingRecipeIngredientDto {

    private Long recipeIngredientId;

    private Recipe recipe;

    private Ingredient ingredient;

    public TestingRecipeIngredientDto() {
    }

    public TestingRecipeIngredientDto(Long recipeIngredientId, Recipe recipe, Ingredient ingredient) {
        this.recipeIngredientId = recipeIngredientId;
        this.recipe = recipe;
        this.ingredient = ingredient;
    }

    public Long getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public void setRecipeIngredientId(Long recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
