package com.example.faa.repo;

import com.example.faa.model.Allergen;
import com.example.faa.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AllergenRepo extends MongoRepository<Allergen, String> {
    Allergen findByAllergens(String role);
}
