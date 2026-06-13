package day_4;

import java.util.Scanner;

public class ATM_PinChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "1234";
        int attempt = 3;



        while(attempt>0){
            System.out.print("Enter your PIN: ");
            String pass = sc.nextLine();

            if(pass.trim().equals(password)){
                System.out.println("Login Successfully");
                break;
            }else{
                attempt--;
                if(attempt != 0){
                    System.out.println("Invalid PIN, Attempts Remaining " + attempt);
                }else {
                    System.out.println("Invalid PIN");
                }
            }
        }

        System.out.println();

        if(attempt == 0){
            System.out.println("Card Blocked. Please contact the bank.");
        }

    }
}
