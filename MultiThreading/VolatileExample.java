package MultiThreading;

import java.util.concurrent.TimeUnit;

public class VolatileExample {

    //volatile represents happens before relationship
    //here value will be stored in main memory and availaible to all threads
    public static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (!stop) {
                    System.out.println("in a while loop ");
                }
            }
        }).start();
        TimeUnit.SECONDS.sleep(5);
        stop = true;
    }
}
