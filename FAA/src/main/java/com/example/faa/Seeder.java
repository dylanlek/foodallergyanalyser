package com.example.faa;

import com.example.faa.model.Allergen;
import com.example.faa.model.UserInfo;
import com.example.faa.repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Seeder implements CommandLineRunner {

    private UserRepo userRepo;
    public Seeder(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public void run(String...strings)throws Exception{
        UserInfo newUserInfo = new UserInfo(
                "dll",
                "dll@g.com",
                "123",
                Arrays.asList(
                        new Allergen("nuts"),
                        new Allergen("coconuts")
                )

                );
                //delete all users from database
                this.userRepo.deleteAll();
                //save preset user
                this.userRepo.save(newUserInfo);
    }
}


