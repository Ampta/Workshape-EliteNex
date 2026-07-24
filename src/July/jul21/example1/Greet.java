package July.jul21.example1;

public class Greet extends Thread{
    Driver driver;
    String name;

    public Greet(Driver driver, String name){
        this.driver = driver;
        this.name = name;
    }

    public void run(){
        try {
            driver.wish(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
