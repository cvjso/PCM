package com.example.pcm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Response {
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Machine> machines = new ArrayList<Machine>();
    private String msg;
    private Optional<User> optional_user;
    private Optional<Machine> optional_machine;

    public ArrayList<User> getUsers() {
        return users;
    }

    public Optional<User> getOptional_user() {
        return optional_user;
    }

    public ArrayList<Machine> getMachines(){
        return machines;
    }

    public Optional<Machine> getOptional_machine(){
        return optional_machine;
    }

    public void setOptional_user(Optional<User> optional_user) {
        this.optional_user = optional_user;
    }

    public void setOptional_machine(Optional<Machine> optional_machine){
        this.optional_machine = optional_machine;
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

    public void setMachines(List<Machine> list){
        this.machines = (ArrayList<Machine>) list;
    }
    
}