package com.example.pocketCook.service;

import com.example.pocketCook.dao.IngredientRepository;
import com.example.pocketCook.entity.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() { return (List<Ingredient>) ingredientRepository.findAll(); }

    public void addIngredient(Ingredient ingredient) { ingredientRepository.save(ingredient); }

    public void updateName(Long id, String name) { ingredientRepository.updateName(id, name); }

    public List<Ingredient> searchByName(String name) { return ingredientRepository.getByName(name); }

    public void deleteIngredient(Long ingredientId) { ingredientRepository.deleteByIngredientId(ingredientId); }
}
