package com.pluralsight;

// child class of LandVehicle
public class SemiTruck extends LandVehicle {

    // private instance variable
    private int cargoCapacity;

    // constructor
    public SemiTruck(String name, int speed, int fuelLevel,
                     int maxPassengers, int numberOfWheels,
                     int cargoCapacity) {

        // call parent constructor
        super(name, speed, fuelLevel, maxPassengers, numberOfWheels);

        this.cargoCapacity = cargoCapacity;
    }

    // move the semi-truck
    @Override
    public void move() {

        System.out.println(getName() + " is hauling heavy cargo.");
    }

    // display semi-truck information
    @Override
    public void getInfo() {

        // call parent method
        super.getInfo();

        System.out.println("Cargo Capacity: " + cargoCapacity);
    }

    // getter
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // setter
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}