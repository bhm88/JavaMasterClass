package MultiThreading;

public class RaceConditionDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        Thread bharat = new Thread(bankAccount);
        Thread ammi = new Thread(bankAccount);

        bharat.setName("bharat");
        ammi.setName("ammi");
        bharat.start();
        ammi.start();
    }
}

class BankAccount implements Runnable {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    @Override
    public void run() {
        withDrawl(75);
        if (balance < 0) {
            System.out.println("money overdrawn by us");
        }
    }

    private synchronized void withDrawl(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + "is about to with draw");
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "has withdrawn amount " + amount);
        } else {
            System.out.println("sorry not enough balance for " + Thread.currentThread().getName());
        }
    }
}
