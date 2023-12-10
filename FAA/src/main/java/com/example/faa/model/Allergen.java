package com.example.faa.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "allergens")
public class Allergen {
    private String allergens;

    public Allergen() {
    }
    public Allergen(String allergens) {
        this.allergens = allergens;
    }
    public String getAllergens() {
        return allergens;
    }
    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }
}
