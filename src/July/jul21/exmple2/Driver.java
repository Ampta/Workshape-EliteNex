package July.jul21.exmple2;

public class Driver {
    public static void main(String[] args) {
        ThreadFirst first = new ThreadFirst();
        ThreadFirst second = new ThreadFirst();
        ThreadFirst third = new ThreadFirst();
        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);

        t1.start();
        t3.start();
        t3.interrupt();
        t1.interrupt();

    }
}
