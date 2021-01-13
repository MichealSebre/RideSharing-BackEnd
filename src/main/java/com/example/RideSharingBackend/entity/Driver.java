package com.example.RideSharingBackend.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="firstName",length=20, nullable = false)
    private String firstName;
    @Column(name="lastName",length=20, nullable = false)
    private String lastName;
    @Column(name="address",length=20, nullable = false)
    private String address;
    @Column(name="driverLicenceNumber",length=20, nullable = false)
    private String driverLicenceNumber;
    @Column(name="phoneNumber",length=20, nullable = false)
    private String phoneNumber;
    @Column(name="bio",length=20, nullable = false)
    private String bio;
    @Column(name="password",length=50, nullable = false)
    private String password;
    @Column(name="birthDate",nullable = false)
    private Date birthDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", driverLicenceNumber='" + driverLicenceNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bio='" + bio + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
