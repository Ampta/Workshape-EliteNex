package July.example1;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Driver driver = new Driver();
        Greet greetS = new Greet(driver, "Shivam");
        Greet greetV = new Greet(driver, "Vivek");
        Thread t1 = new Thread(greetS);
        Thread t2 = new Thread(greetV);
        t1.start();
        t2.start();
        System.out.println("Completed");

    }

     synchronized public void wish(String name) throws InterruptedException {
        for(int i = 1; i<11; i++){
            System.out.println(i + ". Good Morning, " + name);
            Thread.sleep(1000);
        }
    }
}
