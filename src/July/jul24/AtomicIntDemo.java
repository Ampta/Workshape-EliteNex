package July.jul24;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntDemo {
    static AtomicInteger value = new AtomicInteger(100);


    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for(int i = 0; i<10000; i++){
                value.incrementAndGet();
            }
        };

        Thread one = new Thread(runnable);
        Thread two = new Thread(runnable);

        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println(value);
    }


}
