package com.pluralsight;

import java.util.ArrayList;
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
    }

//    ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();


//    ArrayList<Vehicle> vehicles;

    ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> getVePrice = new ArrayList<>();
       Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.println(v);

            }
        }
        return getVePrice;

    }

    ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if((v.getMake().equalsIgnoreCase(userInput) && v.getModel().equalsIgnoreCase(userInput))) {

            }
        }

//        return userInput;
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return vehicles;

    }

    ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.println(v);

            }
        }
        return null;


    }
    ArrayList<Vehicle> getVehiclesByColor(String color){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getColor().equalsIgnoreCase(userInput)) {
                System.out.println(v);

            }
        }
        return null;

    }
    ArrayList<Vehicle> getVehiclesByMileage( int min, int max){
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.println(v);

            }
        }
      return null;

    }
    ArrayList<Vehicle> getVehiclesByType(String type){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Vehicle[] Vehicle = vehicles.toArray(new Vehicle[0]);
        for (Vehicle v : Vehicle) {
            if (v.getVehicleType().equalsIgnoreCase(userInput)) {
                System.out.println(v);

            }
        }
        return null;
//
//
//        return getVehiclesByType();
    }

//    public String addVehicle(Vehicle vehicle){
//        vehicles.add(vehicle);
//        return " Vehicle added successfully!";
//    }
    public String removeVehicle(int vin){

        for(Vehicle v : vehicles){
            if(v.getVin() == vin){
                vehicles.remove(v);
                return "The vehicle was successfully deleted!";
            }

        }

        return "Vehicle with VIN" + vin + "not found.";

    }











}
