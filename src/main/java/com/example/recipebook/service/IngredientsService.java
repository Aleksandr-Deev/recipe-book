package com.example.recipebook.service;

import com.example.recipebook.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientsService {

    public Map<Long, Ingredient> ingredients = new HashMap<>();
    private static long lastId = 0;

    public Ingredient addIngredient(Ingredient ingredient) {
        if (ingredients.containsKey(ingredient.getId())) {
            throw new RuntimeException("Такой ингридиент уже добавлен");
        } else {
            ingredients.put(lastId++, ingredient);
        }
        return ingredient;
    }

    public Ingredient getIngredientId(String id) {
        if (ingredients.containsKey(id)) {
            return ingredients.get(id);
        } else {
            throw new RuntimeException("Рецепт не найден");
        }
    }
}
