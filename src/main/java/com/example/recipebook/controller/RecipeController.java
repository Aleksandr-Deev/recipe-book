package com.example.recipebook.controller;


import com.example.recipebook.model.Recipe;
import com.example.recipebook.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public Recipe getRecipe(@RequestParam String id) {
        return this.recipeService.getRecipeId(id);
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return this.recipeService.addRecipe(recipe);
    }
}
