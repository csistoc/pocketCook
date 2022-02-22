package com.example.pocketCook.entity;

import javax.persistence.*;

@Entity
@Table(name = "RECIPE_COMMENT")
public class RecipeComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long recipeCommentId;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "description")
    private String description;

    public RecipeComment() { }

    public RecipeComment(Long recipeCommentId, Recipe recipe, User user, String description) {
        this.recipeCommentId = recipeCommentId;
        this.recipe = recipe;
        this.user = user;
        this.description = description;
    }

    public Long getRecipeCommentId() {
        return recipeCommentId;
    }

    public void setRecipeCommentId(Long recipeCommentId) {
        this.recipeCommentId = recipeCommentId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
