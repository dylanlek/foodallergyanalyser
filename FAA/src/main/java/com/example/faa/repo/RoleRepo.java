package com.example.faa.repo;


import com.example.faa.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepo extends MongoRepository<Role, String> {
    Role findByRole(String role);
}