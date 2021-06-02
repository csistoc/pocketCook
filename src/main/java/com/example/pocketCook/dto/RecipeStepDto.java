package com.example.pocketCook.dto;

public class RecipeStepDto {

    private Long recipeStepId;

    private String description;

    private Integer stepOrder;

    public RecipeStepDto() { }

    public RecipeStepDto(Long recipeStepId, String description, Integer stepOrder) {
        this.recipeStepId = recipeStepId;
        this.description = description;
        this.stepOrder = stepOrder;
    }

    public Long getRecipeStepId() {
        return recipeStepId;
    }

    public void setRecipeStepId(Long recipeStepId) {
        this.recipeStepId = recipeStepId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }
}
