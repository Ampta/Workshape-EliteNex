package July.example4;

import java.security.spec.RSAOtherPrimeInfo;

public class Driver {
    public static void main(String[] args ) throws InterruptedException {
        Account a1 = new Account();

        Thread t1 = new Thread(() -> {
            a1.withdraw(700);
        });

        Thread t2 = new Thread(() -> {
            a1.withdraw(700);
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}

class Account extends Thread{
    double balance = 1000;

    public synchronized double withdraw(double amount){
        if(balance >= amount){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance = balance-amount;
            System.out.println("balance: " +balance);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Amount " + amount + " is greater than current balance " + balance);
        }
        return balance;
    }
}
