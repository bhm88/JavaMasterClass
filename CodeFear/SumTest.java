package CodeFear;

public class SumTest {

    public static boolean isTrue(int a, int b, int c) {

        return a + b == c || b + c == a || c + a == b;
    }

    public static void main(String[] args) {
        System.out.println(isTrue(1, 2, 3));
    }
}