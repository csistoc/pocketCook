package com.example.pocketCook.dto;

public class CreateCommentDto {

    private Integer recipeId;
    private Integer userId;
    private String description;

    public CreateCommentDto() {
    }

    public CreateCommentDto(Integer recipeId, Integer userId, String description) {
        this.recipeId = recipeId;
        this.userId = userId;
        this.description = description;
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
