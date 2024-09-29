package com.gharseva.HomeCareServiceApplication.Nurse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Nurse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    private String speciality;

    private boolean availability;

    private String area;

    private long mobileNumber;

    private int rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getArea() {
        return area;
    }

    public int getRating() {
        return rating;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
