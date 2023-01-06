package com.example.recipebook.controller;

import com.example.recipebook.model.Ingredient;
import com.example.recipebook.service.IngredientsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class IngredientController {

    private final IngredientsService ingredientsService;


    public IngredientController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }


    @GetMapping
    public Ingredient getIngredient(@RequestParam String id) {
        return this.ingredientsService.getIngredientId(id);
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return this.ingredientsService.addIngredient(ingredient);
    }
}
