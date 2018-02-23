package com.example.cars;

// A class for the car's data.
public class CarData {
    private int year;
    private String make;
    private int makeId;
    private String model;

    public CarData() {
    }
    public CarData(int year, String make, int makeId, String model) {
        this.year = year;
        this.make = make;
        this.makeId = makeId;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}