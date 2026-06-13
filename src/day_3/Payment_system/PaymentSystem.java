package day_3.Payment_system;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentSystem {

    static ArrayList<Payment> db = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void creditCard(){
        System.out.println("=== Credit Card 2% Charges ===");
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Card Number: ");
        String cardNumber = sc.nextLine();

        CreditCard creditCard = new CreditCard(amount, cardNumber);
        creditCard.processPayment();
    }

    public static void upi(){
        System.out.println("=== UPI Zero Charges ===");
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter UPI ID: ");
        String upiId = sc.nextLine();

        Payment upi = new Upi(amount, upiId);
        upi.processPayment();
    }

    public static void netBanking(){
        System.out.println("=== NetBanking 1% Charges ===");
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        Payment netBanking = new NetBanking(amount, accountNumber);
        netBanking.processPayment();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while(choice != 4){
            System.out.println("\n==== Payment Gateway ====");
            System.out.println("1. Credit Card");
            System.out.println("2. UPI");
            System.out.println("3. Net Banking");
            System.out.println("4. Exit");

            System.out.print("Enter Here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    creditCard();
                    break;
                case 2:
                    upi();
                    break;
                case 3:
                    netBanking();
                    break;
                case 4:
                    System.out.println("close");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");

            }

        }


    }
}
