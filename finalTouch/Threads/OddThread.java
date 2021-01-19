package finalTouch.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddThread extends Thread {

    int limit;
    SharedPrinter printer;

    public OddThread(int limit, SharedPrinter printer) {

        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        int oddNum = 1;
        while (oddNum <= limit) {
            printer.printOdd(oddNum);
            oddNum = oddNum + 2;
        }
    }



}
