package MultiThreading;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread t1 = new Thread(new EmailCompaign());
        Thread t2 = new Thread(new DataAggregator());
        t1.setName("EmailCompaign");
        t2.setName("dataAggregator");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inside main");
    }
}

class DataAggregator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class EmailCompaign implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i == 5) {
                Thread.currentThread().yield();
            }
        }
    }
}
