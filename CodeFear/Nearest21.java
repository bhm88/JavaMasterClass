package CodeFear;

public class Nearest21 {

    public static int nearest(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21 && b <= 21) return b;
        if (a <= 21 && b > 21) return a;

        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(nearest(19, 21));
    }
}
