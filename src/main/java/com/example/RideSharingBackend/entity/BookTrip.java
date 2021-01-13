package com.example.RideSharingBackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookTrip {
    @Id
    @GeneratedValue
    private long id;
    private long userId;
    private long vehicleId;
    private long driverId;
    
}
