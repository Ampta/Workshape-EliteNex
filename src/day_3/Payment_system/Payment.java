package day_3.Payment_system;

abstract class Payment {

    double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    abstract void processPayment();
}
