package com.example.RideSharingBackend.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Vehicles")
public class Vehicles {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="make")
    private String make;
    @Column(name="model")
    private String model;
    @Column(name="type")
    private String type;
    @Column(name="millage")
    private double millage;
    @Column(name="style")
    private String style;
    @Column(name="plateNumber")
    private String plateNumber;
    @Column(name="RegExpDate")
    private Date RegExpDate;
    @Column(name="description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getRegExpDate() {
        return RegExpDate;
    }

    public void setRegExpDate(Date regExpDate) {
        RegExpDate = regExpDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", millage=" + millage +
                ", style='" + style + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", RegExpDate=" + RegExpDate +
                ", description='" + description + '\'' +
                '}';
    }
}
