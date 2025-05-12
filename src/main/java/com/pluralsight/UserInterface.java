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
                System.out.println("X) Quit");

                String choice = scanner.nextLine().toLowerCase();

                switch (choice){
                    case "1": processGetByPrice();
                    break;
                    case "2": processGetByMakeModel();
                    break;
                    case "X": keepRunning = false;
                    default:
                        System.out.println("Invalid option - please try again");
                            return;
                }


            }
            scanner.close();

        }




    public void processGetByPrice(){

    }
    public void processGetByMakeModel(){

    }
    public void processGetByYear(){

    }
    public void processGetByColor(){

    }
    public void processGetByMileage(){

    }
    public void processGetByType() {
    }

    private void processAllVehiclesRequest(){

        }


    public void processAddVehicle(){

    }
    public void processRemoveVehicle(){

    }
    public void getAllVehicles(){


    }

}
