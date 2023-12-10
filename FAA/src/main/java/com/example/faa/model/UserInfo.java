package com.example.faa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Document(collection ="users")
public class UserInfo
{
    @Id
    private String userId;
    private String userName;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String userEmail;
    private String password;

    private boolean enabled;
    @DBRef
    private Set<Role> roles;

    private List<Allergen>allergens;



    public UserInfo(String userName, String userEmail,String password,List<Allergen>allergens) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.password = password;
        this.allergens = allergens;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;}

    public List<Allergen> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<Allergen> allergens) {
        this.allergens = allergens;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled(){
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled=enabled;
    }
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
