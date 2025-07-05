/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
package com.balextranit;

public class Passenger {
    private Location pickupLocation;
    private Location destinationLocation;
    

    public Passenger(Location pickupLocation, Location destinationLocation) {
        if (pickupLocation == null || destinationLocation == null) {
            throw new IllegalArgumentException("Pickup and destination locations cannot be null.");
        }
        this.pickupLocation = pickupLocation;
        this.destinationLocation = destinationLocation;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    // You might add other properties like numberOfSeats, passengerId, etc., and their getters/setters
}
