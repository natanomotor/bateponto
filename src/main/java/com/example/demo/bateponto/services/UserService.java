package com.example.demo.bateponto.services;

import com.example.demo.bateponto.model.User;
import com.example.demo.bateponto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public ResponseEntity<User> login(User user){
        Optional<User> u = userRepository.findById(user.getLogin());
        if(u.isEmpty()){
            System.out.println("Usuario não existe");
            return ResponseEntity.notFound().build();
        }
        if(u.get().getLogin().equals(user.getLogin()) && u.get().getPassword().equals(user.getPassword())){
            if(!u.get().isOnline()){
                u.get().setOnline(true);
            }
            System.out.println("Usuario existe");

            return ResponseEntity.ok().body(u.get());
        }
        return null;
    }
    public void register(User user){
        userRepository.save(user);
    }
}
