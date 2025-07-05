package com.balextranit;

public class BALEXTRANITLTD {
    public static void main(String[] args) {
        System.out.println("Starting BALEXTRANIT.LTD...\n");

        //Company instance
        Company balextranitCompany = new Company();

        //PassengerSource instance, passing the Company
        PassengerSource myPassengerSource = new PassengerSource(balextranitCompany);

        System.out.println("--- PassengerSource Pickup Requests ---");

        // Requests
        boolean scheduled1 = myPassengerSource.requestPickup();
        System.out.println("Request 1 submitted. Scheduled: " + scheduled1);

        boolean scheduled2 = myPassengerSource.requestPickup();
        System.out.println("Request 2 submitted. Scheduled: " + scheduled2);

        boolean scheduled3 = myPassengerSource.requestPickup();
        System.out.println("Request 3 submitted. Scheduled: " + scheduled3);

        System.out.println("\n---Complete ---");
    }
}