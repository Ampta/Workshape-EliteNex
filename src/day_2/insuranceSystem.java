package day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class insuranceSystem {

    static ArrayList<Vehicle> vehicle_db = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    private static void addVehicle(){
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicle_num = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String owner_name = sc.nextLine();

        System.out.print("Enter Vehicle Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        String year = sc.nextLine();

        vehicle_db.add(new Vehicle(id, vehicle_num, type, owner_name, price, year));
        System.out.println("Vehicle added successfully.");

    }

    public static void main(String[] args) {

        Vehicle obj = new Vehicle(5, "mshcl", "car", "shivam", 55555, "3045" );




        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 5){
            System.out.println("--- Insurance System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Show Vehicle Details");
            System.out.println("3. Details about Bike, Car and Trucks");
            System.out.println("4. Close");

            System.out.print("Enter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 5:
                    System.out.println("close");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");

            }
        }
    }
}
