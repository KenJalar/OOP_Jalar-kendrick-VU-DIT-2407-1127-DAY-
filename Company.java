/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
package com.balextranit;

public class Company {
    
    public boolean scheduleVehicle(Passenger passenger) {
        System.out.println("Company: Attempting to schedule vehicle for passenger from " +
                           passenger.getPickupLocation() + " to " + passenger.getDestinationLocation());
        
        
            if (passenger == null) {
            throw new IllegalArgumentException("Cannot schedule a null passenger.");
        }
        // --- END ADDITION ---

        System.out.println("Company: Attempting to schedule vehicle for passenger from " +
                           passenger.getPickupLocation() + " to " + passenger.getDestinationLocation());
        return true; // Simulate success
    }
    }

