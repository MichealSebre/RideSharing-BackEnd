package com.example.RideSharingBackend.service;

import com.example.RideSharingBackend.dao.UserRepository;
import com.example.RideSharingBackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User saveUser(User user){
        return repo.save(user);
    }

    public List<User> getAllUser(){
        return repo.findAll();
    }
    
    public User getUserById(Long id){
        return repo.getOne(id);
    }

    public Optional<User> findById(Long id){
        return repo.findById(id);
    }



    public void deleteUser(Long id){
        repo.deleteById(id);
    }



}
