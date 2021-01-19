package finalTouch.Threads;

public class SharedPrinter {

    boolean isOddPrinted = false;

    public synchronized void printOdd(int n){

        while(isOddPrinted){

            try{
                wait();
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " " + n);

        isOddPrinted=true;

        try {
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }
    public synchronized void printeven(int n){

        while( !isOddPrinted){

            try{
                wait();
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " " + n);

        isOddPrinted=false;

        try {
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();
    }
}

