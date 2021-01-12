package com.example.RideSharingBackend.dao;

import com.example.RideSharingBackend.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long> {

}
