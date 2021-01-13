package com.example.RideSharingBackend.controller;

import com.example.RideSharingBackend.entity.Driver;
import com.example.RideSharingBackend.entity.User;
import com.example.RideSharingBackend.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DriverController {
    @Autowired
    private DriverService service;

    @PostMapping("/addDriver")
    public Driver addDriver(@RequestBody Driver driver){
        return service.saveDriver(driver);
    }

    @GetMapping(value="/Driver")
    public List<Driver> getAll(){
        return service.getAllDriver();
    }

    @GetMapping(value="/Driver/{id}")
    public Driver getDriverById(@PathVariable("id") Long id){
        return service.getDriverById(id);
    }

    @PostMapping(value="/driverUpdate")
    public Driver updatePartialDriver(@RequestBody Driver driver){
        return service.saveDriver(driver);
    }

    @PostMapping(value="/deleteDriver/{id}")
    public void deleteDriver(@PathVariable("id") Long id){
        service.deleteDriver(id);
    }
}
