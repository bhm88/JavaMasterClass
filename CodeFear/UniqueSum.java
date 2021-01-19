package CodeFear;

public class UniqueSum {

    public static int uniqueSum(int a, int b, int c) {
        ///look at the order of execution is important here
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) return c;
        if (b == c) return a;
        if (c == a) return b;

        return a + b + c;

    }

    public static void main(String[] args) {
        System.out.println(uniqueSum(3, 3, 3));
    }
}
