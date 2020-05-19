package com.example.pcm.controller;

import java.util.List;
import java.util.Optional;

import com.example.pcm.model.User;
import com.example.pcm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PCM")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public String create(@RequestBody User user) {
        User u = userService.create(user);
        return u.toString();
    }

    @GetMapping("/get")
    public Optional<User> getId(@RequestBody String id) {
        return userService.getById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

}