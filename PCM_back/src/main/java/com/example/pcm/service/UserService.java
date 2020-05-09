package com.example.pcm.service;

import java.util.List;

import com.example.pcm.model.User;
import com.example.pcm.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(String email, String senha){
        return userRepository.save(new User(email,senha));
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User update(String email,String senha){
        User u = userRepository.findByEmail(email);
        u.setSenha(senha);
        return userRepository.save(u);
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }

    public void deleteUser(String email){
        User u = userRepository.findByEmail(email);
        userRepository.delete(u);
    }

}