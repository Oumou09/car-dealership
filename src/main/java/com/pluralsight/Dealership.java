package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

//    ArrayList<Vehicle> vehicles;

    ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.println(v);

            }
        }
        return vehicles;

    }

    ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){

        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if(v.getMake() )
        }

        return null;

    }

    ArrayList<Vehicle> getVehiclesByYear(int min, int max){

        return null;

    }
    ArrayList<Vehicle> getVehiclesByColo(String color){

        return null;

    }
    ArrayList<Vehicle> getVehiclesByMileage( int min, int max){

        return null;

    }
    ArrayList<Vehicle> getVehiclesByType(String type){


        return null;

    }

    public String addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        return " Vehicle added successfully!";
    }
    public String remoteVehicle(int vin){

        return "The vehicle was successfully deleted!";

    }











}
