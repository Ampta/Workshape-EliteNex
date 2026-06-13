package day_3.Payment_system;

public class CreditCard extends Payment{

    String cardNumber;

    public CreditCard(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("\nProcessing Credit Card Payment");
        System.out.println("Card Number: " + cardNumber.toUpperCase());
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Charge: " + amount * 0.02);
        System.out.println("Final Amount Debited: " + (amount - amount * 0.02));
        System.out.println("Payment Successful");

    }
}
