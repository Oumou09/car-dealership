package com.pluralsight;

import java.io.*;


public class DealershipFileManager {
    Dealership getDealership() {
        Dealership dealership = null;

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
                 dealership.addVehicle(vehicle);
//                System.out.println(vehicle);


            }
            reader.close();

        } catch (IOException ioException) {
            System.out.println("First vehicle: " + dealership.getAllVehicles().get(0));

        }
        return dealership;


    }

    public void saveDealership (Dealership dealership ){
            if (dealership == null) {
                System.out.println("Dealership cannot be null");
            }

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("dealership_info.csv"));
                writer.write(dealership.getName() + "," + dealership.getAddress() + "," + dealership.getPhone());
                writer.newLine();
                writer.close();


                System.out.println("Dealership saved successfully");
            } catch (IOException e) {
                throw new RuntimeException("Failed to save dealership", e);
            }
        }




}
