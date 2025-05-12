package com.pluralsight;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {


    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();

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

                    case "X": keepRunning = false;
                    default:
                        System.out.println("Invalid option - please try again");
                            return;
                }


            }
            scanner.close();

        }


    public void processGetByPriceRequest(){

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){

    }
    public void processGetByTypeRequest() {
    }

    private void processGetAllVehiclesRequest(){

        }

    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }

}
