package com.pluralsight;

// child class of Transportation
public class Hovercraft extends Transportation {

    // private instance variables
    private int hoverHeight;
    private boolean canTravelOnWater;

    // constructor
    public Hovercraft(String name, int speed, int fuelLevel,
                      int maxPassengers, int hoverHeight,
                      boolean canTravelOnWater) {

        // call parent constructor
        super(name, speed, fuelLevel, maxPassengers);

        this.hoverHeight = hoverHeight;
        this.canTravelOnWater = canTravelOnWater;
    }

    // move the hovercraft
    @Override
    public void move() {

        System.out.println(getName() + " is gliding above the surface.");
    }

    // display hovercraft information
    @Override
    public void getInfo() {

        // call parent method
        super.getInfo();

        System.out.println("Hover Height: " + hoverHeight);
        System.out.println("Can Travel On Water: " + canTravelOnWater);
    }

    // getters
    public int getHoverHeight() {
        return hoverHeight;
    }

    public boolean isCanTravelOnWater() {
        return canTravelOnWater;
    }

    // setters
    public void setHoverHeight(int hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    public void setCanTravelOnWater(boolean canTravelOnWater) {
        this.canTravelOnWater = canTravelOnWater;
    }
}