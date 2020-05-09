package com.example.pcm.controller;

import java.util.List;

import com.example.pcm.model.User;
import com.example.pcm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/create")
    public String create(@RequestParam String email, @RequestParam String senha){
        User u = userService.create(email, senha);
        return u.toString();
    }

    @RequestMapping("/get")
    public User getEmail(@RequestParam String email){
        return userService.getByEmail(email);
    }

    @RequestMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @RequestMapping("/update")
    public String update(@RequestParam String email, @RequestParam String senha){
        User u = userService.update(email,senha);
        return u.toString();
    }

    @RequestMapping("/delete")
    public String deleteUser(@RequestParam String email){
        userService.deleteUser(email);
        return "Deleted"+email;
    }

    @RequestMapping("/deleteAll")
    public String deleteAll(){
        userService.deleteAll();
        return "Deleted all users";
    }



}