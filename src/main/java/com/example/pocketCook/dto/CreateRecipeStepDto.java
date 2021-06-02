package com.example.pocketCook.dto;

public class CreateRecipeStepDto {

    private String description;

    private Integer stepOrder;

    private Long recipeId;

    public CreateRecipeStepDto() {
    }

    public CreateRecipeStepDto(String description, Integer stepOrder, Long recipeId) {
        this.description = description;
        this.stepOrder = stepOrder;
        this.recipeId = recipeId;
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

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }
}
