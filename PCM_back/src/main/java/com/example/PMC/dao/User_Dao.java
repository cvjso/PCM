package com.example.PMC.dao;

import java.util.ArrayList;
import java.util.List;
import com.example.PMC.model.*;

public class User_Dao{
    private List<User> users = new ArrayList<>();

    public String insert_user(User user){
        users.add(user);
        return "User "+user.getemail()+" added";
    }
}