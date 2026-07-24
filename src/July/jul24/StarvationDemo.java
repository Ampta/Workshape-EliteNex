package July.jul24;

public class StarvationDemo {
    public static final Object lock = new Object();

    public static void main(String[] args) {

        Thread highPriority = new Thread(() -> {
            while(true){
                synchronized (lock){
                    System.out.println("High working");
                }
            }
        });

        Thread lowPriority = new Thread(() -> {
            while(true){
                synchronized (lock){
                    System.out.println("Low working");
                }
            }
        });

        highPriority.setPriority(Thread.MAX_PRIORITY);
        lowPriority.setPriority(Thread.MIN_PRIORITY);
        highPriority.start();
        lowPriority.start();
    }
}
