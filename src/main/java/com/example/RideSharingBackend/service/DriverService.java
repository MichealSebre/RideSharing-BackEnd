package com.example.RideSharingBackend.service;

import com.example.RideSharingBackend.dao.DriverRepository;
import com.example.RideSharingBackend.entity.Driver;
import com.example.RideSharingBackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//driver class to be tested on git! But this one is from MichealTest
@Service
public class DriverService {
    @Autowired
    private DriverRepository repo;

    public Driver saveDriver(Driver driver){
        return repo.save(driver);
    }

    public List<Driver> getAllDriver(){
        return repo.findAll();
    }

    public Driver getDriverById(Long id){
        return repo.getOne(id);
    }

    public Optional<Driver> findById(Long id){
        return repo.findById(id);
    }



    public void deleteDriver(Long id){
        repo.deleteById(id);
    }

}
