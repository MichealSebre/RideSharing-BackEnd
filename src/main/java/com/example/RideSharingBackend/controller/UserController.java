package com.example.RideSharingBackend.controller;

import com.example.RideSharingBackend.entity.User;
import com.example.RideSharingBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
          return service.saveUser(user);
    }

    @GetMapping(value="/Users")
    public List<User> getAll(){
        return service.getAllUser();
    }

    @GetMapping(value="/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return service.getUserById(id);
    }

    @PostMapping(value="/userUpdate")
    public User updatePartialUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @PostMapping(value="/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Long id){
               service.deleteUser(id);
    }
}
