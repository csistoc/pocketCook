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

    public List<RecipeComment> getAllCommentsFromRecipe(Integer recipeId) { return recipeCommentRepository.getByRecipeId(recipeId); }

    public List<RecipeComment> getAllCommentsByUser(Integer userId) { return recipeCommentRepository.getByUserId(userId); }

    public void addComment(RecipeComment recipeComment) { recipeCommentRepository.save(recipeComment); }

    public void deleteRecipeCommentsByRecipeId(Integer recipeId) { recipeCommentRepository.deleteByRecipeId(recipeId); }

    public void deleteRecipeCommentsByUserId(Integer userId) { recipeCommentRepository.deleteByUserId(userId); }

    public void deleteSpecificRecipeComment(Integer recipeId, Integer userId) { recipeCommentRepository.deleteByRecipeIdAndUserId(recipeId, userId); }
}
