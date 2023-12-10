package com.example.faa.service;

import com.example.faa.model.Allergen;
import com.example.faa.model.Role;
import com.example.faa.model.UserInfo;
import com.example.faa.repo.RoleRepo;
import com.example.faa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    public UserInfo findUserByEmail(String email) {
        return userRepo.findByUserEmail(email);
    }
    public UserInfo findUserbyUsername(String username){
        return userRepo.findByUserName(username);
    }

    public void saveUser(UserInfo user) {
        user.setEnabled(true);
        Role userRole = roleRepo.findByRole("ADMIN");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepo.save(user);
    }
    public void createUser(String username, String email, String password) {
        UserInfo newUser = new UserInfo(username,email,password,new ArrayList<>());
        newUser.setUserName(username);
        newUser.setUserEmail(email);
        newUser.setPassword(password);
        userRepo.save(newUser);
    }
    public void addAllergen(List<Allergen>allergens){
    }
    public void updateAllergen(UserInfo userInfo){
    }
    public boolean authenticateUser(String username, String password) {
        return userRepo.existsById(username) && userRepo.existsById(password);
    }
}
