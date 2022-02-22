package com.example.pocketCook.entity;

import javax.persistence.*;

@Entity
@Table(name = "RECIPE_STEP")
public class RecipeStep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long recipeStepId;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column(name = "description")
    private String description;

    @Column(name = "step_order")
    private Integer stepOrder;

    public RecipeStep() { }

    public RecipeStep(Long recipeStepId, Recipe recipe, String description, Integer stepOrder) {
        this.recipeStepId = recipeStepId;
        this.recipe = recipe;
        this.description = description;
        this.stepOrder = stepOrder;
    }

    public Long getRecipeStepId() {
        return recipeStepId;
    }

    public void setRecipeStepId(Long recipeStepId) {
        this.recipeStepId = recipeStepId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
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
