package com.company;

public class Car {

    // private member variables
    private String model;
    private String make;
    private int year;
    private String color;
    private int speed;

    // no-argument default constructor
    public Car() {

    }

    // one-arg constructor
    public Car(String color) {
        setColor(color);
    }

    public Car(int year) {
        this.year = year;
    }


    // overloaded constructor
//    public Car(String model, String make, int year, String color){
//        this.color = color;
//        this.model = model;
//        this.make = make;
//        this.year = year;
//    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // additional functions
    // methods which return a string indicating each task the car is performing.

    /*
    * The red Porsche is starting
The red Porsche is accelerating
The red Porsche is going 50 mph
The red Porsche is stopped*/

    public String start() {
        return getColor() + getMake() + " is starting.";
    }

    public String accel() {
        return " is accelerating.";
    }

    public String showSpeed() {
        return " is going " + getSpeed() + " mph.";
    }

    public String stop() {
        return " is stopped.";
    }

    public String getDescription() {
       return "Make: " + getMake() +"  "+ "Model: " + getModel() + " Color: " + getColor();
    }
}