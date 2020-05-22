package com.example.pcm.service;

import java.util.List;
import java.util.Optional;


import com.example.pcm.model.Request;
import com.example.pcm.model.User;
import com.example.pcm.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User create(Request request){
        User user = new User(request.getEmail(), request.getSenha());
        return userRepository.save(user);
    }

    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
    
    public void updateUser(String email,String senha){
        User r = userRepository.findByEmail(email);
        r.setSenha(senha);
        userRepository.save(r);
    }

}