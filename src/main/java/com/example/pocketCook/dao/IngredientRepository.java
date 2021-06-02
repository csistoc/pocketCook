package com.example.pocketCook.dao;

import com.example.pocketCook.entity.Ingredient;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    @Transactional
    @Modifying
    @Query("update Ingredient i set i.name = :name where i.id = :id")
    void updateName(@Param("id") Long id, @Param("name") String name);

    void deleteByIngredientId(Long ingredientId);

    List<Ingredient> getByName(String name);
}
