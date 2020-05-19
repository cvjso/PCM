package com.example.pcm.service;

import java.util.List;
import java.util.Optional;

import com.example.pcm.model.User;
import com.example.pcm.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User create(User user){
        return userRepository.save(user);
    }

    public Optional<User> getById(String id){
        return userRepository.findById(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

}