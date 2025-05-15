# Car Dealership Management System

## Description of the Project

This Java console application manages a car dealership inventory system. It allows dealership staff to track, update, and search their vehicle inventory. Users can search for vehicles by various criteria (price range, make/model, year, color, mileage, vehicle type), add new vehicles to inventory, and remove existing vehicles. The application stores vehicle data in CSV files for persistent data management.

## User Stories

- As a user, I want to search for vehicles within a specific price range, so that I can find options that fit my budget.
- As a user, I want to be able to find vehicles by color, so I can find a vehicles that is my favorite color.
- As a user, I want to search for vehicles within a specific year range, so that I can find cars that are newer or within a certain age.
- As a user, I want to search for vehicles within a specific year range, so that I can find cars that are newer or within a certain age.
- As a user, I want to filter by vehicle type, so that I can easily find the kind of vehicle that fits my needs (like a family van or rugged truck).

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK (version 8 or higher) is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class (likely called `Main.java` or `CarDealershipApplication.java`) with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'Main.main()'' to start the application.
6. The application will launch in the console window where you can interact with the menu.

## Technologies Used

- Java 8+
- File I/O for CSV processing
- Object-Oriented Programming principles

## Class Structure

Our application consists of the following key classes:

1. Vehicle - Stores information about each vehicle (VIN, make, model, year, color, odometer, price, type)
2. Dealership - Manages a collection of vehicles and provides methods to search, add, and remove vehicles
3. DealershipFileManager - Handles reading/writing dealership data to/from CSV files
4. UserInterface - Manages user interaction via console commands and displays

## Features

- Search vehicles by multiple criteria:
    - Price range
    - Make/Model
    - Year range
    - Color
    - Mileage range
    - Vehicle type
- View all vehicles in inventory
- Add new vehicles to inventory
- Remove vehicles from inventory
- Persistent data storage using CSV files

## Future Work

- Add user authentication for different roles (manager, salesperson, etc.)
- Implement vehicle sales tracking and reporting
- Create a graphical user interface (GUI) version
- Add customer management functionality
- Implement vehicle service history tracking

## Resources

- Potato Sensei
- https://github.com/RayMaroun/yearup-spring-section-10-2025/tree/master

## Team Members

- Oumou Diallo - Developer

## Acknowledgments

- Thanks to my instructor Raymond Maroun for his guidance throughout this project.
- Special thanks to peers who provided feedback during development. 