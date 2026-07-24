package July.jul21.example3;

public class A {
    boolean flag = true;
    int count = 0;

    public synchronized void produce(){
        try{
            while(count <= 50){
                if(flag == true){
                    count = count+1;
                    System.out.println("Producer Produced Item: " + count);
                    flag = false;
                    notify();
                    wait();
                }else{
                    wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume(){
        try{
            while(count<=51){
                if(flag == true){
                    wait();
                }else{
                    System.out.println("Cunsumer consumed Item: " + count);
                    flag = true;
                    notify();
                    wait();
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread{
    A a;
    Producer(A a){
        this.a = a;
    }

    public void run(){
        a.produce();
    }
}

class Cunsumer extends Thread{
    A a;
    Cunsumer(A a){
        this.a = a;
    }

    public void run(){
        a.consume();
    }
}

