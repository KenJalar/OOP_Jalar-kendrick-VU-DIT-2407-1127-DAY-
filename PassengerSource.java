/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
package com.balextranit;

import java.util.Random;

public class PassengerSource {
    private Company company; // Collaborator: Company

    public PassengerSource(Company company) {
        if (company == null) {
            throw new IllegalArgumentException("Company cannot be null.");
        }
        this.company = company;
    }

    public boolean requestPickup() {
        Random random = new Random();

        //Random pickup and destination locations (0 to 100 inclusive)
        int pickupX = random.nextInt(101);
        int pickupY = random.nextInt(101);
        Location pickupLocation = new Location(pickupX, pickupY);

        int destinationX = random.nextInt(101);
        int destinationY = random.nextInt(101);
        Location destinationLocation = new Location(destinationX, destinationY);

        // Creating a new Passenger
        Passenger passenger = new Passenger(pickupLocation, destinationLocation);

        return company.scheduleVehicle(passenger);
    }
}
