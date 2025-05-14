package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

//  ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();


//  ArrayList<Vehicle> vehicles;

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
            if (v.getPrice() >= min && v.getPrice() <= max) {
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
            if (v.getPrice() >= min && v.getPrice() <= max) {
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
//
//
//        return getVehiclesByType();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(int vin){

        for(Vehicle v : vehicles){
            if(v.getVin() == vin){
                vehicles.remove(v);
            }

        }

        return "Vehicle with VIN" + vin + "not found.";

    }











}
