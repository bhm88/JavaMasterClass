package MultiThreading;

import java.util.concurrent.TimeUnit;

public class MyFirstThread {
    public static void main(String[] args) {
        Task task= new Task();
        Thread t = new Thread(task);
        t.start();
        try {
           // Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("inside main..");
    }
}
class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("inside run");
        go();
    }

    private void go() {
        System.out.println("inside go..");
        more();
    }

    private void more() {
        System.out.println("inside more..");
    }
}
