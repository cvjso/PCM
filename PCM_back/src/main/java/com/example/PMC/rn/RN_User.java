package com.example.PMC.rn;

import com.example.PMC.dao.User_Dao;
import com.example.PMC.model.User;

public class RN_User {
    private final User_Dao user_Dao;

    public String insert_user(String email, String password){
        
        // Hash de password
        // Verificação se usuário está já no banco

        User user_added = new User(email,password);
        return user_Dao.insert_user(user_added);
    }

    public RN_User(User_Dao user_Dao) {
        this.user_Dao = user_Dao;
    }
}