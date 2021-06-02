package com.example.pocketCook.dao;

import com.example.pocketCook.entity.RecipeComment;
import org.springframework.data.repository.CrudRepository;

public interface RecipeCommentRepository extends CrudRepository<RecipeComment, Long> {
}
