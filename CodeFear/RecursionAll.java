package CodeFear;

public class RecursionAll {

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);

    }

    public static int isPaliandrome(int n, int temp) {
        if (n == 0) {
            return temp;
        }

        temp = (temp * 10) + n % 10;


        return isPaliandrome(n / 10, temp);
    }

    public static boolean strPal(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return strPal(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {

        //factorial program
        System.out.println(factorial(5));

        System.out.println(isPrime(89, 2));
        int t = isPaliandrome(121, 0);
        if (t == 121) {
            System.out.println("true");
        } else {
            System.out.println("not pal");
        }

        System.out.println("str pal " + strPal("aba"));
    }
}
