package com.example.pocketCook.dao;

import com.example.pocketCook.entity.RecipeComment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeCommentRepository extends CrudRepository<RecipeComment, Long> {

    List<RecipeComment> getByRecipe_Id(Long recipeId);

    List<RecipeComment> getByUser_Id(Long userId);

    //void deleteByRecipe_Id(Long recipeId);

    //void deleteByUser_Id(Long userId);

    //void deleteByRecipe_IdAndUser_Id(Long recipeId, Long userId);
}
