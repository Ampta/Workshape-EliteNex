package July.jul24;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    public static final ReentrantLock lock1 = new ReentrantLock();
    public static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1){
                System.out.println("Thread 1 lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Thread 1 lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock1){
                System.out.println("Thread 2 lock 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Thread 2 lock 2");
                }
            }
        });

        t1.start();
        t2.start();

    }
}
