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


//System.out.println("Loaded " + dealership.getAllVehicle() + " vehicles.");
    }

    public void display(){
       init();
//        try {
//            BufferedReader br = new FileReader("dealership.csv");
//        } catch (Exception e){
//            e.printStackTrace();
//
//        }


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
                            return;
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
//        dealership.getVehiclesByPrice();
//      System.out.println("What price point would you like to shop at?");
//       double matchUserPrice = scanner.nextDouble();
//       if (vehicles.getPrice == matchUserPrice){
//           System.out.println(vehicles);
//       }
//        if(matchUserPrice.isEmpty()){
//        }
        System.out.println("Enter minimum price:");
        double min = scanner.nextDouble();

        System.out.println("Enter maximum price:");
        double max = scanner.nextDouble();
        List<Vehicle> vehicles =  dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicles);




    }
    public void processGetByMakeModelRequest(){
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        List<Vehicle> vehicles =  dealership.getVehiclesByMakeModel(make,model);
        displayVehicles(vehicles);


    }
    public void processGetByYearRequest(){
        System.out.println("Enter vehicle minimum year: ");
        int min = scanner.nextInt();
        System.out.println("Enter vehicle minimum year: ");
        int max = scanner.nextInt();

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
        System.out.println("Enter vehicle maximum year: ");
        int max = scanner.nextInt();

        List<Vehicle> vehicles =  dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicles);


    }
    public void processGetByTypeRequest() {
        System.out.println("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();
        List<Vehicle> vehicles =  dealership.getVehiclesByType(vehicleType);
        displayVehicles(vehicles);
    }

    private void processGetAllVehiclesRequest(){
        displayVehicles(dealership.getAllVehicles());


    }

    public void processAddVehicleRequest(){
        System.out.println();



        dealership.addVehicle()



    }
    public void processRemoveVehicleRequest(){
        System.out.println("Enter the vin number: ");

    }


}
