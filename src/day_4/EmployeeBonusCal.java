package day_4;

import java.util.Scanner;

public class EmployeeBonusCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("== Calculate Employee Bonus By Rating ==");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Performance Rating (A, B, C, D): ");
        String rating = sc.nextLine().toUpperCase();

        switch (rating){
            case "A":
                calculateBonus(name, salary, "A");
                break;
            case "B":
                calculateBonus(name, salary, "B");
                break;
            case "C":
                calculateBonus(name, salary, "C");
                break;
            case "D":
                System.out.println("rating d");
                break;
            default:
                System.out.println("Invalid rating");
        }
    }

    private static void calculateBonus(String name, double salary, String rating) {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Rating: " + rating);
        System.out.println();

        if(rating.equals("A")){
            double bonus = salary * 0.2;
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Final Salary: " + (salary + bonus));
        }else if(rating.equals("B")){
            double bonus = salary * 0.15;
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Final Salary: " + (salary + bonus));
        }else if(rating.equals("C")){
            double bonus = salary * 0.1;
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Final Salary: " + (salary + bonus));
        }else if(rating.equals("D")){
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("Final Salary: " + (salary + bonus));
        }
    }

}
