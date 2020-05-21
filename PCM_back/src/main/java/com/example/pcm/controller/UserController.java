package com.example.pcm.controller;

import java.util.List;
import java.util.Optional;

import com.example.pcm.model.Request;
import com.example.pcm.model.Response;
import com.example.pcm.model.User;
import com.example.pcm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping("/user")
    public Response controller(@RequestBody Request request) {
        String param = request.getOperation();
        Response response = new Response();


        if(param.equals("create")){
            userService.create(request);
            response.setMsg("User created");
        }

        else if(param.equals("get")){
            response.setOptional_user(userService.getById(request.getEmail()));
        }

        else if(param.equals("getAll")){
            response.setUsers(userService.getAll());
        }

        else if(param.equals("delete")){
            userService.deleteUser(request.getEmail());
            response.setMsg("User deleted");
        }

        else if(param.equals("update")){
            userService.updateUser(request.getEmail(),request.getSenha());
            response.setMsg("User updated");
        }

        else{
            response.setMsg("Nenhum 'operation' para ser feito");
        }

        return response;
    }

    @GetMapping("/get")
    public Optional<User> getId(@RequestBody Request request) {
        return userService.getById(request.getEmail());
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @DeleteMapping("/delete")
    public void deletedUser(@RequestBody Request request){
        userService.deleteUser(request.getEmail());
    }

    @PutMapping("/update")
    public void updatedUser(@RequestBody Request request){
        userService.updateUser(request.getEmail(),request.getSenha());
    }
}