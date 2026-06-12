package day_1;


import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {

    static ArrayList<Employee> employeeLists = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        employeeLists.add(new Employee(id, name.toUpperCase(), department.toUpperCase(), address.toUpperCase(), salary));

        System.out.println("Employee added successfully!");
    }

    private static void showAllEmployee(){

        if(employeeLists.isEmpty()){
            System.out.println("No Employee");
        }

        for (Employee emp : employeeLists){
            System.out.println("-- Employee Details -- \nName: " + emp.getFullName() + "\nDepartment: " + emp.getDepartment() +
                                "\nAddress: " + emp.getAddress());
        }
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice !=5){
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employee");
            System.out.println("5. Close");

            System.out.print("Enter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showAllEmployee();
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
