package com.example.pocketCook.dto;

import com.example.pocketCook.entity.RecipeComment;
import com.example.pocketCook.entity.RecipeIngredient;

import java.util.Set;

public class RecipeTestingDto {

    private Long recipeId;

    private String name;

    private String description;

    private UserTestingDto user;

    private Set<RecipeIngredient> recipeIngredients;

    private Set<RecipeComment> recipeComments;

    private Set<RecipeStepDto> recipeSteps;

    public RecipeTestingDto() { }

    public RecipeTestingDto(Long recipeId, String name, String description, UserTestingDto user,
                            Set<RecipeIngredient> recipeIngredients, Set<RecipeComment> recipeComments, Set<RecipeStepDto> recipeSteps) {
        this.recipeId = recipeId;
        this.name = name;
        this.description = description;
        this.user = user;
        this.recipeIngredients = recipeIngredients;
        this.recipeComments = recipeComments;
        this.recipeSteps = recipeSteps;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTestingDto getUser() {
        return user;
    }

    public void setUser(UserTestingDto user) {
        this.user = user;
    }

    public Set<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(Set<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public Set<RecipeComment> getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(Set<RecipeComment> recipeComments) {
        this.recipeComments = recipeComments;
    }

    public Set<RecipeStepDto> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(Set<RecipeStepDto> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }
}
