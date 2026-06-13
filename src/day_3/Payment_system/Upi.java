package day_3.Payment_system;

public class Upi extends Payment{

    String upiId;

    public Upi(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("\nProcessing UPI Payment");
        System.out.println("UPI Id: " + upiId.toUpperCase());
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Charge: " + 0.0);
        System.out.println("Final Amount Debited: " + amount);
        System.out.println("Payment Successful");
    }
}
