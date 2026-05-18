package com.pluralsight;

// main application class
public class MainApp {

    // main method
    public static void main(String[] args) {

        // create transportation objects
        Transportation moped = new Moped(
                "City Moped",
                45,
                80,
                2,
                2,
                true);

        Transportation car = new Car(
                "Sports Car",
                120,
                60,
                5,
                4,
                15);

        Transportation semiTruck = new SemiTruck(
                "Big Rig",
                90,
                100,
                2,
                18,
                5000);

        Transportation hovercraft = new Hovercraft(
                "Hover Master",
                70,
                75,
                6,
                10,
                true);

        // demonstrate polymorphism
        System.out.println("=== TRANSPORTATION INFORMATION ===");

        System.out.println();

        // display moped information
        moped.getInfo();
        moped.move();

        System.out.println();

        // display car information
        car.getInfo();
        car.move();

        System.out.println();

        // display semi-truck information
        semiTruck.getInfo();
        semiTruck.move();

        System.out.println();

        // display hovercraft information
        hovercraft.getInfo();
        hovercraft.move();
    }
}