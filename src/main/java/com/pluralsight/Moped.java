package com.pluralsight;

// child class of LandVehicle
public class Moped extends LandVehicle {

    // private instance variable
    private boolean helmetRequired;

    // constructor
    public Moped(String name, int speed, int fuelLevel,
                 int maxPassengers, int numberOfWheels,
                 boolean helmetRequired) {

        // call parent constructor
        super(name, speed, fuelLevel, maxPassengers, numberOfWheels);

        this.helmetRequired = helmetRequired;
    }

    // move the moped
    @Override
    public void move() {

        System.out.println(getName() + " is zipping through traffic.");
    }

    // display moped information
    @Override
    public void getInfo() {

        // call parent method
        super.getInfo();

        System.out.println("Helmet Required: " + helmetRequired);
    }

    // getter
    public boolean isHelmetRequired() {
        return helmetRequired;
    }

    // setter
    public void setHelmetRequired(boolean helmetRequired) {
        this.helmetRequired = helmetRequired;
    }
}