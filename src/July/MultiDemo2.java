package July;

public class MultiDemo2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            System.out.println("Payment Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Payment completed");

        });
        t1.start();
        t1.join();

        System.out.println("Generated Invoice");
    }
}

class Payment extends Thread{
    public void run(){

    }
}
