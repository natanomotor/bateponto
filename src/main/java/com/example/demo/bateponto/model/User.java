package com.example.demo.bateponto.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @NonNull
    private String login;
    @NonNull
    private String password;
    private boolean online;
    public User(String login,String password){
        this.login = login;
        this.password = password;
    }
}
