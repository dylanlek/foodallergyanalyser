package com.example.faa;

import com.example.faa.model.Allergen;
import com.example.faa.model.Role;
import com.example.faa.model.UserInfo;
import com.example.faa.repo.AllergenRepo;
import com.example.faa.repo.RoleRepo;
import com.example.faa.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaaApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(RoleRepo roleRepo, UserRepo userRepo, AllergenRepo allergenRepo){
		return args -> {
			Role adminRole = roleRepo.findByRole("ADMIN");
			if (adminRole == null) {
				Role newAdminRole = new Role();
				newAdminRole.setRole("ADMIN");
				roleRepo.save(newAdminRole);
			}


			Role userRole = roleRepo.findByRole("USER");
			if (userRole == null) {
				Role newUserRole = new Role();
				newUserRole.setRole("USER");
				roleRepo.save(newUserRole);
			}
		};
	}
}
