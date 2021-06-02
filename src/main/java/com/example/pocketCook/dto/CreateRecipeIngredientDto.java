package com.example.pocketCook.dto;

public class CreateRecipeIngredientDto {

    private Long recipeId;

    private Long ingredientId;

    public CreateRecipeIngredientDto() {
    }

    public CreateRecipeIngredientDto(Long recipeId, Long ingredientId) {
        this.recipeId = recipeId;
        this.ingredientId = ingredientId;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }
}
