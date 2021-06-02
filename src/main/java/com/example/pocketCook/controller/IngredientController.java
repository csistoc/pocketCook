package com.example.pocketCook.controller;

import com.example.pocketCook.dto.CreateIngredientDto;
import com.example.pocketCook.dto.IngredientTestingDto;
import com.example.pocketCook.entity.Ingredient;
import com.example.pocketCook.service.IngredientService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/ingredient")
@RestController
//localhost:8080/ingredient
public class IngredientController {

    private IngredientService ingredientService;
    private ModelMapper modelMapper = new ModelMapper();

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public void addIngredient(@RequestBody CreateIngredientDto createIngredientDto) {
        ingredientService.addIngredient(convertCreateIngredientDtoToEntity(createIngredientDto));
    }

    @GetMapping
    public List<CreateIngredientDto> getAllIngredients() {
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return ingredients.stream()
                .map(this::convertToCreateIngredientDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/admin")
    public List<IngredientTestingDto> getAllIngredientsWithData() {
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return ingredients.stream()
                .map(this::convertToIngredientTestingDto)
                .collect(Collectors.toList());
    }

    @PutMapping("/admin/updateName/{id}")
    public void updateName(@PathVariable @Valid @Min(0) Long id, @RequestParam String name) {
        ingredientService.updateName(id, name);
    }

    @GetMapping("/searchIngredient/{name}")
    public List<CreateIngredientDto> searchIngredient(@PathVariable @Valid String name) {
        List<Ingredient> ingredients = ingredientService.searchByName(name);
        return ingredients.stream()
                .map(this::convertToCreateIngredientDto)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{ingredientId}")
    @Transactional
    public void deleteIngredient(@PathVariable Long ingredientId) {
        ingredientService.deleteIngredient(ingredientId);
    }

    // internal conversion methods //

    private CreateIngredientDto convertToCreateIngredientDto(Ingredient ingredient) {
        return modelMapper.map(ingredient, CreateIngredientDto.class);
    }

    private Ingredient convertCreateIngredientDtoToEntity(CreateIngredientDto createIngredientDto) {
        return modelMapper.map(createIngredientDto, Ingredient.class);
    }

    private IngredientTestingDto convertToIngredientTestingDto(Ingredient ingredient) {
        return modelMapper.map(ingredient, IngredientTestingDto.class);
    }

    private Ingredient convertIngredientTestingDtoToEntity(IngredientTestingDto ingredientTestingDto) {
        return modelMapper.map(ingredientTestingDto, Ingredient.class);
    }
}
