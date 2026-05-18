package com.pluralsight;

// child class of Transportation
// represents all land vehicles
public class LandVehicle extends Transportation {

        // private instance variable
        private int numberOfWheels;

        // constructor
        public LandVehicle(String name, int speed, int fuelLevel,
                           int maxPassengers, int numberOfWheels) {

            // call parent constructor
            super(name, speed, fuelLevel, maxPassengers);

            this.numberOfWheels = numberOfWheels;
        }

        // drive the land vehicle
        public void drive() {

            System.out.println(getName() + " is driving on the road.");
        }

        // display land vehicle information
        @Override
        public void getInfo() {

            // call parent method
            super.getInfo();

            System.out.println("Number of Wheels: " + numberOfWheels);
        }

        // getter
        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        // setter
        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }
    }