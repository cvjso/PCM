package com.example.PMC.dao;

import java.util.UUID;

import com.example.PMC.model.User;

public interface UserDao {
    
    int insert_user(UUID id, User user);
    
    default int add_user(User user){
        UUID id = UUID.randomUUID();
        return insert_user(id, user);
    }
}