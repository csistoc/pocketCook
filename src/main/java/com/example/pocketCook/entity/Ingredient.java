package com.example.pocketCook.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "INGREDIENT")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private Set<RecipeIngredient> recipeIngredients;

    public Ingredient() { }

    public Ingredient(Long ingredientId, String name, Set<RecipeIngredient> recipeIngredients) {
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
