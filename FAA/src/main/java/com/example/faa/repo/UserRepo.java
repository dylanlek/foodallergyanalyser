package com.example.faa.repo;

import com.example.faa.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo
        extends MongoRepository<UserInfo, String> {
    UserInfo findByUserEmail(String userEmail);
    UserInfo findByUserName(String userName);

    @Override
    public void delete(UserInfo userInfo);

}
