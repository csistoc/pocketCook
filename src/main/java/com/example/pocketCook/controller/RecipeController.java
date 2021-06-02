package com.example.pocketCook.controller;

import com.example.pocketCook.dto.CreateRecipeDto;
import com.example.pocketCook.dto.CreateRecipeIngredientDto;
import com.example.pocketCook.dto.CreateRecipeStepDto;
import com.example.pocketCook.dto.RecipeTestingDto;
import com.example.pocketCook.entity.Recipe;
import com.example.pocketCook.entity.RecipeIngredient;
import com.example.pocketCook.entity.RecipeStep;
import com.example.pocketCook.service.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/recipe")
@RestController
//localhost:8080/recipe
public class RecipeController {

    private RecipeService recipeService;
    private ModelMapper modelMapper = new ModelMapper();

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<RecipeTestingDto> getAllRecipes() {
        List<Recipe> recipes = recipeService.getAllRecipes();
        return recipes.stream()
                .map(this::convertToRecipeTestingDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public void addRecipe(@RequestBody CreateRecipeDto createRecipeDto) {
        recipeService.addRecipe(convertCreateRecipeDtoToEntity(createRecipeDto));
    }

    @PostMapping("/addRecipeStep")
    public void addRecipeStep(@RequestBody CreateRecipeStepDto createRecipeStepDto) {
        recipeService.addRecipeStep(convertCreateRecipeStepDtoToEntity(createRecipeStepDto));
    }

    @PostMapping("/addIngredientToRecipe")
    public void addIngredientToRecipe(@RequestBody CreateRecipeIngredientDto createRecipeIngredientDto) {
        recipeService.addIngredientToRecipe(convertRecipeIngredientToCreateRecipeIngredientDto(createRecipeIngredientDto));
    }

    @DeleteMapping("/{recipeId}")
    @Transactional
    public void deleteRecipe(@PathVariable Long recipeId) {
        recipeService.deleteRecipe(recipeId);
    }


    // internal conversion methods //

    private RecipeTestingDto convertToRecipeTestingDto(Recipe recipe) {
        return modelMapper.map(recipe, RecipeTestingDto.class);
    }

    private CreateRecipeIngredientDto convertToCreateRecipeIngredientDto(RecipeIngredient recipeIngredient) {
        return modelMapper.map(recipeIngredient, CreateRecipeIngredientDto.class);
    }

    private RecipeIngredient convertRecipeIngredientToCreateRecipeIngredientDto(CreateRecipeIngredientDto createRecipeIngredientDto) {
        return modelMapper.map(createRecipeIngredientDto, RecipeIngredient.class); }

    private RecipeStep convertCreateRecipeStepDtoToEntity(CreateRecipeStepDto createRecipeStepDto) {
        return modelMapper.map(createRecipeStepDto, RecipeStep.class);
    }

    private CreateRecipeDto convertToCreateRecipeDto(Recipe recipe) { return modelMapper.map(recipe, CreateRecipeDto.class); }

    private Recipe convertCreateRecipeDtoToEntity(CreateRecipeDto createRecipeDto) { return modelMapper.map(createRecipeDto, Recipe.class); }
}
