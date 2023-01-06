package com.example.recipebook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recipe {

    private final String id;
    private final String nameRecipe;
    private final int cookingTimeMinutes;
    private Ingredient[] ingredients;
    private String cookingSteps;

}
