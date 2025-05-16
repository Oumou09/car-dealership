package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> getVePrice = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                getVePrice.add(v);

            }
        }
        return getVePrice;

    }
   public List<Vehicle> getVehiclesByMakeModel(String make, String model){
       List<Vehicle> matchingMakeModel  = new ArrayList<>();;
        for (Vehicle v : vehicles) {
            if((v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model))) {
               matchingMakeModel.add(v);

            }
        }

        return matchingMakeModel;
    }

    public List<Vehicle> getAllVehicles(){
        return vehicles;

    }

   public List<Vehicle> getVehiclesByYear(int min, int max){
       List<Vehicle> matchingYear  = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getYear() >= min && v.getYear() <= max) {
                matchingYear.add(v);

            }
        }
        return matchingYear;


    }
    public List<Vehicle> getVehiclesByColor(String color){
        List<Vehicle> matchingColor  = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getColor().equalsIgnoreCase(color)) {
                matchingColor.add(v);

            }
        }
        return matchingColor;

    }
    public List<Vehicle> getVehiclesByMileage( int min, int max){
        List<Vehicle> matchingMileage = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                matchingMileage.add(v);

            }
        }
      return matchingMileage;

    }

    public List<Vehicle> getVehiclesByType(String type){
        List<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase(type)) {
                matchingVehicles.add(v);
            }
        }
        return matchingVehicles;

    }

    public void addVehicle(Vehicle vehicle) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("dealership.csv"));
           for(Vehicle v : vehicles) {
               writer.write(String.valueOf(v));
               writer.newLine();
               vehicles.add(vehicle);
           }

            writer.close();
            }catch(Exception e){
            throw new RuntimeException("Error adding to file",e);

        }

    }

    public void removeVehicle(int vin) {
        for (int i = 0; i < vehicles.size();){
            Vehicle v = vehicles.get(i);
            if (v.getVin() == vin) {
                vehicles.remove(i);
            }
            break;




        }

    }


    }












