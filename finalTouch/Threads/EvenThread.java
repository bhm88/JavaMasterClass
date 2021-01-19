package finalTouch.Threads;

public class EvenThread extends Thread {

    int limit;
    SharedPrinter printer;

    public EvenThread(int limit, SharedPrinter printer) {

        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        int evenNum = 2;
        while (evenNum <= limit) {
            printer.printeven(evenNum);
            evenNum = evenNum + 2;
        }
    }
}