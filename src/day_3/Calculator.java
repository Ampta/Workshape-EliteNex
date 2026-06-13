package day_3;

public class Calculator {
    public static void main(String[] args) {

        // addition of two numbers
        System.out.println("Sum of two number: " + sum(3,5));

        // addition of three numbers
        System.out.println("Sum of three number: " + sum(3,5,8));

        // addition of decimal numbers
        System.out.println("Sum of decimal number: " + sum(3.6,5.9));

        // multiplication of two numbers
        System.out.println("Multiplication of two number: " + multiplication(3,5));


    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static int multiplication(int num1, int num2){
        return num1*num2;
    }

}
