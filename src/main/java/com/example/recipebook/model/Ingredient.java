package com.example.recipebook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {

    private String id;
    private String name;
    private int count;
    private String measureUnit;
}
