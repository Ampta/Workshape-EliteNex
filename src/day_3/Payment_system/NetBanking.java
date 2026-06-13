package day_3.Payment_system;

public class NetBanking extends Payment {
    String accountNumber;

    public NetBanking(double amount, String accountNumber){
        super(amount);
        this.accountNumber = accountNumber;
    }

    @Override
    void processPayment() {
        System.out.println("\nProcessing Net Banking");
        System.out.println("Account Number: " + accountNumber.toUpperCase());
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Charge: " + amount * 0.01);
        System.out.println("Final Amount Debited: " + (amount - amount * 0.01));
        System.out.println("Payment Successful");
        System.out.println("Payment Successful");
    }
}
