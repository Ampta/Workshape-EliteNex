package July.jul24;

public class Normal {
    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {//c1

        Thread worker1 = new Thread(() -> {//t c=t
            System.out.println("Worker 1 thread started");
            while(flag){

            }
            System.out.println("Worker 1 stopped");
        });
        worker1.start();

        Thread.sleep(2000);
        System.out.println("Main Thread stopped");
        flag=false;
    }
}
