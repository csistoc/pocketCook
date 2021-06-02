package com.example.pocketCook.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "RECIPE")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<RecipeIngredient> recipeIngredients;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<RecipeComment> recipeComments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<RecipeStep> recipeSteps;

    public Recipe() { }

    public Recipe(Long recipeId, String name, String description, User user,
                  Set<RecipeIngredient> recipeIngredients, Set<RecipeComment> recipeComments, Set<RecipeStep> recipeSteps) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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

    public Set<RecipeStep> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(Set<RecipeStep> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }
}
