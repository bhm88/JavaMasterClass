package java8;

import java.util.Optional;

public class Test1 {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("hi");
        }).start();

        Thread t = new Thread(() -> {
            System.out.println("just inside run method");
        });
        t.start();

        Runnable r = new Thread(() -> {
            System.out.println("just inside runnable run method");
        });
        Thread t2 = new Thread(r);
        t2.start();

        //optional example

        String name = "ammi";

        char[] ch = {'a', 'b', 'c', 'd'};
        String s = ch.toString();
        Optional<String> op = Optional.ofNullable(s);
        Optional.of(op.get());
        if (op.isPresent()) {
            System.out.println(op.toString());
        }


    }
}
