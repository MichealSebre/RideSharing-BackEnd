package com.example.RideSharingBackend.entity;

import javax.persistence.*;

@Entity
@Table(name="VehicleImages")
public class VehicleImages {
    @Id
    @GeneratedValue
    private long id;
    @Column(name="vehicleId")
    private long vechileId;
    @Column(name="images")
    private String images;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVechileId() {
        return vechileId;
    }

    public void setVechileId(long vechileId) {
        this.vechileId = vechileId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "VehicleImages{" +
                "id=" + id +
                ", vechileId=" + vechileId +
                ", images='" + images + '\'' +
                '}';
    }
}
