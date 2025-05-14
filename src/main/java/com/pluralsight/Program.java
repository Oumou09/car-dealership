package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
//      DealershipFileManager fileManager = new DealershipFileManager();
//        Dealership dealership;
//       dealership = fileManager.getDealership();
//
        UserInterface ui = new UserInterface();
        ui.display();

        DealershipFileManager fileManager = new DealershipFileManager();

        Dealership dealership = fileManager.getDealership();  // Load from dealership.csv

        if (dealership == null) {
            System.out.println("Failed to load dealership.");
            return;
        }

        ArrayList<Vehicle> vehicles = dealership.getAllVehicles(); // or getAllVehicles()

        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("Loaded " + vehicles.size() + " vehicles:");
            for (Vehicle v : vehicles) {
                System.out.println(v);
            }
        }
    }

}
