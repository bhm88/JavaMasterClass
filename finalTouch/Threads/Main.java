package finalTouch.Threads;

public class Main {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        OddThread oddThread = new OddThread(20, printer);

        oddThread.setName("Odd-Thread");

        EvenThread evenThread = new EvenThread(20, printer);

        evenThread.setName("Even-Thread");

        oddThread.start();

        evenThread.start();
    }
}
