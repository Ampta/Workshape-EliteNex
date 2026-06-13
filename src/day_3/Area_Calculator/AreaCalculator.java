package day_3.Area_Calculator;

import java.util.Scanner;

public class AreaCalculator {


    static Scanner sc = new Scanner(System.in);

    public static void areaOfSquare(){
        System.out.println("=== Calculate Area of Square ===");
        System.out.print("Enter Side of Square: ");
        double side = sc.nextDouble();
        sc.nextLine();

        Shape square = new Square(side);
        System.out.println("Area of Square with given side: " + side + "cm is: " + square.area());
    }

    public static void areaOfRectangle(){
        System.out.println("=== Calculate Area of Rectangle ===");
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Width: ");
        double width = sc.nextDouble();
        sc.nextLine();

        Shape rectangle = new Rectangle(height, width);
        System.out.println("Area of Rectangle with given height: " + height + "cm and width: " + width + " is: " + rectangle.area());

    }

    public static void areaOfCircle(){
        System.out.println("=== Calculate Area of Circle ===");
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        sc.nextLine();

        Shape circle = new Circle(radius);
        System.out.println("Area of Circle with given radius: " + radius + "cm is: " + circle.area());

    }

    public static void areaOfTriangle(){
        System.out.println("=== Calculate Area of Triangle ===");
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        sc.nextLine();

        Shape triangle = new Triangle(base, height);
        System.out.println("Area of Triangle with given base: " + base + "cm and height: " + height + " is: " + triangle.area());

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 5){

            System.out.println("\n==== Area Calculator Application ====");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Triangle");
            System.out.println("5. Exit");

            System.out.print("Enter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    areaOfSquare();
                    break;
                case 2:
                    areaOfRectangle();
                    break;
                case 3:
                    areaOfCircle();
                    break;
                case 4:
                    areaOfTriangle();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }

    }


}
