package com.example.pocketCook.dao;

import com.example.pocketCook.entity.RecipeComment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeCommentRepository extends CrudRepository<RecipeComment, Long> {

    List<RecipeComment> getByRecipeId(Integer recipeId);

    List<RecipeComment> getByUserId(Integer userId);

    void deleteByRecipeId(Integer recipeId);

    void deleteByUserId(Integer userId);

    void deleteByRecipeIdAndUserId(Integer recipeId, Integer userId);
}
