package com.example.pocketCook.service;

import com.example.pocketCook.dao.RecipeCommentRepository;
import com.example.pocketCook.entity.RecipeComment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {

    private RecipeCommentRepository recipeCommentRepository;

    public CommentsService(RecipeCommentRepository recipeCommentRepository) {
        this.recipeCommentRepository = recipeCommentRepository;
    }

    public List<RecipeComment> getAllComments() { return (List<RecipeComment>) recipeCommentRepository.findAll(); }

    public List<RecipeComment> getAllCommentsFromRecipe(Long recipeId) { return recipeCommentRepository.getByRecipe_Id(recipeId); }

    public List<RecipeComment> getAllCommentsByUser(Long userId) { return recipeCommentRepository.getByUser_Id(userId); }

    public void addComment(RecipeComment recipeComment) { recipeCommentRepository.save(recipeComment); }

    //public void deleteRecipeCommentsByRecipeId(Long recipeId) { recipeCommentRepository.deleteByRecipe_Id(recipeId); }

    //public void deleteRecipeCommentsByUserId(Long userId) { recipeCommentRepository.deleteByUser_Id(userId); }

    //public void deleteSpecificRecipeComment(Long recipeId, Long userId) { recipeCommentRepository.deleteByRecipe_IdAndUser_Id(recipeId, userId); }
}
