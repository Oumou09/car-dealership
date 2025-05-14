package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class DealershipFileManager {
    Dealership getDealership() {
        Dealership dealership = new Dealership("Oumou","538 W 50th St", "347-111-2222");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("dealership.csv"));
            String line;
            if ((line = reader.readLine()) != null) {
                String[] field = line.split("\\|");
                String name = field[0];
                String address = field[1];
                String phone = field[2];
                dealership = new Dealership(name, address, phone);
            }
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
//              dealership.addVehicle(vehicle);
                System.out.println(vehicle);


            }
            reader.close();

        } catch (IOException ioException) {
            System.out.println("First vehicle: " + dealership.getAllVehicles().get(0));

        }
        return dealership;


    }

    public void saveDealership (Dealership dealership ){

    }
}
