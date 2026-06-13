package day_4;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Check your give number ===");
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.nextLine();

        if(number > 0 ){
            System.out.println("Number is positive");
        }else if(number < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }
    }

}
