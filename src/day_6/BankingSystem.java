package day_6;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankingSystem {

    static ArrayList<Account> accounts = new ArrayList<>();
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static BankingService bankingService = new BankingService();

    private static void createAccount(){

        System.out.print("Enter Holder Name: ");
        String holderName = sc.nextLine();

        System.out.print("Choose Account Type (SAVING, CURRENT OR SALARY): ");
        AccountType accountType = AccountType.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Enter initial Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        bankingService.createAccount(holderName, accountType, balance);

    }

    private static void accountDetails(){
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine().toUpperCase();

        bankingService.showDetails(accountNumber);
    }

    private static void deposit(){
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine().toUpperCase();

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        bankingService.deposit(accountNumber, amount);

    }

    private static void withdraw(){
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine().toUpperCase();

        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        bankingService.withdraw(accountNumber, amount);
    }

    private static void transfer(){
        System.out.println("transfer");
    }

    private static void statement(){
        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine().toUpperCase();

        bankingService.statement(accountNumber);
    }



    public static void main(String[] args) {

        System.out.println();

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 7){
            System.out.println("\n=== Welcome to Banking System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Account Details");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Monthly Statement");
            System.out.println("7. Exit");

            System.out.print("Enter here: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountDetails();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    statement();
                    break;
                case 7:
                    System.out.println("Close Successfully");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }
}
