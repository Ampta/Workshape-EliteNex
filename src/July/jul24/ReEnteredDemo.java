package July.jul24;

import java.util.concurrent.locks.ReentrantLock;

public class ReEnteredDemo {
    public static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();

        try{
            System.out.println(lock.getHoldCount());
            random();
        }finally {
            lock.unlock();
        }
    }

    public static void random(){
        lock.lock();
        System.out.println(lock.getHoldCount());
    }
}
