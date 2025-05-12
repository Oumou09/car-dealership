package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    ArrayList<Vehicle> vehicles;

    ArrayList<Vehicle> getVehiclesByPrice(double min, double max){

    }

    ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){

    }

    ArrayList<Vehicle> getVehiclesByYear(int min, int max){

    }
    ArrayList<Vehicle> getVehiclesByColo(String color){

    }
    ArrayList<Vehicle> getVehiclesByMileage( int min, int max){

    }
    ArrayList<Vehicle> getVehiclesByType(String type){

    }

    public String addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        return " Vehicle added successfully!";

    }
    public void remoteVehicle(int vin){

    }











}
