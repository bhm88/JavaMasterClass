package CodeFear;

public class OrderedNumbers {

    public static boolean isOrdered(int a, int b, int c, boolean itsOK) {
        if (itsOK) {
            return (b < c);
        }
        return (a < b) && (b < c) && (a < c);
//using ternary
        // return (itsOK) ?(b < c):(a < b) && (b < c) && (a < c);
    }

    public static void main(String[] args) {
        System.out.println(isOrdered(1, 2, 4, false));
    }
}
