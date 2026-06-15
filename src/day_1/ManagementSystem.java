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

    private static void updateEmployee(){

        System.out.print("Enter Employee Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for(Employee e : employeeLists){
            if(e.getId() == id){
                System.out.println("Updated Employee Details");
                System.out.print("Enter New Full Name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter New Department: ");
                String newDepartment = scanner.nextLine();

                System.out.print("Enter New Address: ");
                String newAddress = scanner.nextLine();

                System.out.print("Enter New Salary: ");
                double newSalary = scanner.nextDouble();

                e.setFullName(newName);
                e.setDepartment(newDepartment);
                e.setAddress(newAddress);
                e.setSalary(newSalary);

                System.out.println("Employee ID: " + id + " Updated Successfully");

            }else{
                System.out.println("Employee with Id: " + id + " not present");
            }
        }
    }

    private static void deleteEmployee(){
        System.out.println("Delete Employee");
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        for(Employee e: employeeLists){
            if(e.getId() == id){
                employeeLists.remove(e);
                System.out.println("Employee ID: " + id + " with Deleted Successfully");
            }else{
                System.out.println("Employee with Id: " + id + " not present");
            }
        }

    }





    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice !=5){
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
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
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
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
