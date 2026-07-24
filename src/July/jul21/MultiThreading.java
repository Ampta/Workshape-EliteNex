package July.jul21;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Demo obj = new Demo();
        Thread t1 = new Thread(obj);
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

      //  Thread.sleep(1000);
        System.out.println(t1.getState());

        System.out.println(Demo.sum);

        DemoRunnable demoRunnable = new DemoRunnable();
        Thread t2 = new Thread(demoRunnable);
        t2.start();
        t2.join();
        System.out.println(DemoRunnable.sum);
    }
}


class Demo extends Thread{
    static int sum;

    public void run(){
        for(int i = 1; i<11; i++){
            sum = sum + i;
        }
    }
}

class DemoRunnable implements Runnable{
    static int sum;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 1; i<11; i++){
            sum = sum + i;
        }
    }
}