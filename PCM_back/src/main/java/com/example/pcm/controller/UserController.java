package com.example.pcm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.pcm.model.Request_user;
import com.example.pcm.model.Response;
import com.example.pcm.model.User;
import com.example.pcm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    public UserController(UserService userService){
        this.userService = userService;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/user")
    public Response controller(@RequestBody Request_user request) {
        String param = request.getOperation();
        Response response = new Response();
        switch(param) {

            case "add_user":
                userService.create(request);
                response.setMsg("User created");
            
            case "get_user":
                Optional<User> requested_user =  userService.getById(request.getEmail());
                if(requested_user.isPresent()) {
                    User desired_user = requested_user.get(); 
                    if(request.getSenha().compareTo(desired_user.getSenha()) == 0 ){
                        ArrayList<User> users = new ArrayList<User>();
                        users.add(desired_user);
                        response.setUsers(users);
                    }
                    else{
                        response.setMsg("Credenciais inválidas");
                    }
                }
                else{
                    response.setMsg("Credenciais inválidas");
                }

            case "getAll_user":
                response.setUsers(userService.getAll());
            
            case "delete_user":
                userService.deleteUser(request.getEmail());
                response.setMsg("User deleted");

            case "update_user":
                userService.updateUser(request.getEmail(),request.getSenha());
                response.setMsg("User updated");

            default:
                response.setMsg("Nenhum 'operation' para ser feito");
            
        }

        return response;
    }


    @GetMapping("/get")
    public Optional<User> getId(@RequestBody Request_user request) {
        return userService.getById(request.getEmail());
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @DeleteMapping("/delete")
    public void deletedUser(@RequestBody Request_user request){
        userService.deleteUser(request.getEmail());
    }

    @PutMapping("/update")
    public void updatedUser(@RequestBody Request_user request){
        userService.updateUser(request.getEmail(),request.getSenha());
    }
}