package MultiThreading;

import java.util.concurrent.atomic.AtomicLong;

public class AutomicVariable {
    private static AtomicLong atomicLong = new AtomicLong();

    public static long getNewId() {
        return atomicLong.getAndIncrement();
    }

    public static void main(String[] args) {
        System.out.println(getNewId());
        System.out.println(getNewId());
    }
}
