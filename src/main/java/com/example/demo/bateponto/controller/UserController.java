package com.example.demo.bateponto.controller;

import com.example.demo.bateponto.model.User;
import com.example.demo.bateponto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value="/login")
    public ResponseEntity<User> login(HttpServletRequest httpServletRequest, @RequestParam(name = "login") String login, @RequestParam(name="senha") String senha){
        User user = new User(login,senha);
        System.out.println("Oiiii");
        return userService.login(user);
    }

    @PostMapping(value="/register")
    public String register(@RequestParam(name = "login") String login, @RequestParam(name="senha") String senha){
        User user = new User(login,senha);
        userService.register(user);
        return "/login";
    }
}
