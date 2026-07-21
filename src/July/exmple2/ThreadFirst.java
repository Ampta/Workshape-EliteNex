package July.exmple2;

public class ThreadFirst extends Thread{
    public void run (){
        System.out.println("Working hehe");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
        System.out.println("done");
    }
}
