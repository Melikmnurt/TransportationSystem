package com.pluralsight;

// child class of LandVehicle
public class Car extends LandVehicle {

    // private instance variable
    private int trunkSpace;

    // constructor
    public Car(String name, int speed, int fuelLevel,
               int maxPassengers, int numberOfWheels,
               int trunkSpace) {

        // call parent constructor
        super(name, speed, fuelLevel, maxPassengers, numberOfWheels);

        this.trunkSpace = trunkSpace;
    }

    // move the car
    @Override
    public void move() {

        System.out.println(getName() + " is driving on the highway.");
    }

    // display car information
    @Override
    public void getInfo() {

        // call parent method
        super.getInfo();

        System.out.println("Trunk Space: " + trunkSpace);
    }

    // getter
    public int getTrunkSpace() {
        return trunkSpace;
    }

    // setter
    public void setTrunkSpace(int trunkSpace) {
        this.trunkSpace = trunkSpace;
    }
}