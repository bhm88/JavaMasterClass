package MultiThreading;

import java.util.concurrent.TimeUnit;

public class SynchronizedEx {
    private static boolean stop;
   // synchronized  represents happens before relationship
    private static synchronized void requestStop() {
        stop = true;
    }

    private static synchronized boolean stop() {
        return stop;
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (!stop()) {
                    System.out.println("in a while loop ");
                }
            }
        }).start();

        TimeUnit.SECONDS.sleep(5);
        requestStop();
    }
}
