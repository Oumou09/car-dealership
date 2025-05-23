package com.pluralsight;

import javax.swing.tree.VariableHeightLayoutCache;
import java.awt.desktop.QuitEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    private Dealership dealership;

    private void init() {
 DealershipFileManager fileManager = new DealershipFileManager();
this.dealership = fileManager.getDealership();
    }

    public void display(){
       init();


        Scanner scanner= new Scanner(System.in);
            boolean keepRunning = true;
            while(keepRunning){
                System.out.println();
                System.out.println("Welcome to the Car Dealership!");
                System.out.println("What would you like to do: ");
                System.out.println("1) Search by price range");
                System.out.println("2) Search by make/model");
                System.out.println("3) Search by vehicle year");
                System.out.println("4) Search by vehicle color ");
                System.out.println("5) Search by vehicle Mileage");
                System.out.println("6) Search by vehicle type");
                System.out.println("7) List all vehicles");
                System.out.println("8) Add a Vehicle");
                System.out.println("9) Remove a vehicle");
                System.out.println("X) Quit");

                String choice = scanner.nextLine().toLowerCase();

                switch (choice){
                    case "1": processGetByPriceRequest();
                         break;
                    case "2": processGetByMakeModelRequest();
                        break;
                    case "3": processGetByYearRequest();
                        break;
                    case "4": processGetByColorRequest();
                        break;
                    case "5":processGetByMileageRequest();
                        break;
                    case "6": processGetByTypeRequest();
                        break;
                    case "7": processGetAllVehiclesRequest();
                        break;
                    case "8": processAddVehicleRequest();
                         break;
                    case "9": processRemoveVehicleRequest();
                        break;
                    case "x": keepRunning = false;
                    break;
                    default:
                        System.out.println("Invalid option - please try again");
                }


            }
            scanner.close();

        }


    public void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("Error vehicle field is empty");
        } else {
            for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        }
    }


    public void processGetByPriceRequest(){

        System.out.println("Enter minimum price:");
        double min = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter maximum price:");
        double max = scanner.nextDouble();
        scanner.nextLine();

        List<Vehicle> vehicles =  dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicles);




    }
    public void processGetByMakeModelRequest(){
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
       scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        scanner.nextLine();
        List<Vehicle> vehicles =  dealership.getVehiclesByMakeModel(make,model);
        displayVehicles(vehicles);


    }
    public void processGetByYearRequest(){
        System.out.println("Enter vehicle minimum year: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter vehicle maximum year: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        List<Vehicle> vehicles =  dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicles);


    }
    public void processGetByColorRequest(){
        System.out.println("Enter vehicle color: ");
        String color = scanner.nextLine();
        List<Vehicle> vehicles =  dealership.getVehiclesByColor(color);
        displayVehicles(vehicles);


    }
    public void processGetByMileageRequest(){
        System.out.println("Enter vehicle minimum mileage: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter vehicle maximum mileage: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        List<Vehicle> vehicles =  dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicles);


    }
    public void processGetByTypeRequest() {
        System.out.println("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();
        scanner.nextLine();
        List<Vehicle> vehicles =  dealership.getVehiclesByType(vehicleType);
        displayVehicles(vehicles);
    }

    private void processGetAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());


    }

    public void processAddVehicleRequest(){
        System.out.println("Enter the vin number of the vehicle you want to add: ");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the year of the vehicle you want to add: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the make of the vehicle you want to add: ");
        String make = scanner.nextLine();
        System.out.println("Enter the model of the vehicle you want to add: ");
        String model = scanner.nextLine();
        System.out.println("Enter the type of the vehicle you want to add: ");
        String vehicleType = scanner.nextLine();
        System.out.println("Enter the color of the vehicle you want to add: ");
        String color = scanner.nextLine();
        System.out.println("Enter the odometer of the vehicle you want to add: ");
        int odometer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the price of the vehicle you want to add: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
       dealership.addVehicle(vehicle);
       DealershipFileManager fileManager = new DealershipFileManager();
       fileManager.saveDealership(dealership);

        System.out.println("Vehicle added successfully");

    }
    public void processRemoveVehicleRequest(){
        System.out.println("Enter the vin number of the vehicle you want removed: ");
        int vin = scanner.nextInt();
        dealership.removeVehicle(vin);

        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        System.out.println("Vehicles removed successfully!");



    }


}
