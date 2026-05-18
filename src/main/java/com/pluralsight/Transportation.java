package com.pluralsight;

// parent class for all transportation types
public class Transportation {

    // private instance variables
    private String name;
    private int speed;
    private int fuelLevel;
    private int maxPassengers;

    // constructor
    public Transportation(String name, int speed, int fuelLevel, int maxPassengers) {

        this.name = name;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.maxPassengers = maxPassengers;
    }

    // move the transportation
    public void move() {
        System.out.println(name + " is moving.");
    }

    // stop the transportation
    public void stop() {
        System.out.println(name + " has stopped.");
    }

    // refuel the transportation
    public void refuel() {

        fuelLevel = 100;

        System.out.println(name + " has been refueled.");
    }

    // display transportation information
    public void getInfo() {

        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Max Passengers: " + maxPassengers);
    }

    // getters
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}