package com.example.pocketCook.dao;

import com.example.pocketCook.entity.RecipeStep;
import org.springframework.data.repository.CrudRepository;

public interface RecipeStepRepository extends CrudRepository<RecipeStep, Long> {
}
