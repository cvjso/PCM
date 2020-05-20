package com.example.pcm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Response {
    private ArrayList<User> users = new ArrayList<User>();
    private String msg;
    private Optional<User> optional_user;

    public ArrayList<User> getUsers() {
        return users;
    }

    public Optional<User> getOptional_user() {
        return optional_user;
    }

    public void setOptional_user(Optional<User> optional_user) {
        this.optional_user = optional_user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setUsers(List<User> list) {
        this.users = (ArrayList<User>) list;
    }
    
}