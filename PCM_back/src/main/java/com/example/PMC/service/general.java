package com.example.PMC.service;

import com.example.PMC.rn.RN_User;

import org.springframework.beans.factory.annotation.Autowired;

public class general {
    private RN_User rn_User;

    @Autowired
    public general(RN_User rn_User) {
        this.rn_User = rn_User;
    }

    public String insert_user()

    
}