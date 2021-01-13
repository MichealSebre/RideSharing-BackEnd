package com.example.RideSharingBackend.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Trip")
public class Trip {
    @Id
    @GeneratedValue
    private long id;
    private String from;
    private String to;
    private Date date;
    private long vehicleId;
    private long driverId;
    @Column(name="status",columnDefinition = "String default Active")
    private String status;
    private int seats;
    private double price;
    private String details;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public long getDriverId() {
        return driverId;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", vehicleId=" + vehicleId +
                ", driverId=" + driverId +
                ", status='" + status + '\'' +
                ", seats=" + seats +
                ", price=" + price +
                ", details='" + details + '\'' +
                '}';
    }
}
