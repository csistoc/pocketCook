package com.example.pocketCook.service;

import com.example.pocketCook.dao.RecipeCommentRepository;
import com.example.pocketCook.dao.RecipeIngredientRepository;
import com.example.pocketCook.dao.RecipeRepository;
import com.example.pocketCook.dao.RecipeStepRepository;
import com.example.pocketCook.entity.Recipe;
import com.example.pocketCook.entity.RecipeIngredient;
import com.example.pocketCook.entity.RecipeStep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;
    private RecipeStepRepository recipeStepRepository;
    private RecipeIngredientRepository recipeIngredientRepository;
    private RecipeCommentRepository recipeCommentRepository;

    public RecipeService(RecipeRepository recipeRepository, RecipeStepRepository recipeStepRepository,
                         RecipeIngredientRepository recipeIngredientRepository,
                         RecipeCommentRepository recipeCommentRepository) {
        this.recipeRepository = recipeRepository;
        this.recipeStepRepository = recipeStepRepository;
        this.recipeIngredientRepository = recipeIngredientRepository;
        this.recipeCommentRepository = recipeCommentRepository;
    }

    public List<Recipe> getAllRecipes() {
        return (List<Recipe>) recipeRepository.findAll();
    }

    public void addRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public void addRecipeStep(RecipeStep recipeStep) { recipeStepRepository.save(recipeStep); }

    public void addIngredientToRecipe(RecipeIngredient recipeIngredient) { recipeIngredientRepository.save(recipeIngredient); }

    public void deleteRecipe(Long recipeId) {
        recipeRepository.deleteById(recipeId);
    }


}
