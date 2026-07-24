package July.jul24;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {

    public static void main(String[] args) {
//        Executor executor = Executors.newSingleThreadExecutor();
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        for(int i =0; i<100; i++){

            int finalI = i;
            executor1.execute(() -> {
                System.out.println(Thread.currentThread().getName() + finalI);
            });

        }

//        executor.execute(() -> {
//            System.out.println("working");
//            System.out.println(Thread.currentThread().getName());
//        });
    }
}
