package com.example.RideSharingBackend.entity;

import javax.persistence.*;

@Entity
@Table(name="VehicleFeatures")
public class VehicleFeatures {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="vehicleId")
    private long vehicleId;
    @Column(name="features")
    private String features;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "VehicleFeatures{" +
                "id=" + id +
                ", vehicleId=" + vehicleId +
                ", features='" + features + '\'' +
                '}';
    }
}
