package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        DealershipFileManager fileManager = new DealershipFileManager();
        Dealership dealership;
        dealership = fileManager.getDealership();

        UserInterface ui = new UserInterface();
        ui.display();
    }

}
