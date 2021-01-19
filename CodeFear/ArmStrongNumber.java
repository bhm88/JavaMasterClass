package CodeFear;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrng(153));
        System.out.println(isArmStrng1(153));
    }

    public static boolean isArmStrng1(int n) {
        int temp = n;
        int noofdigits = String.valueOf(n).length();
        int sum = 0;
        while (temp != 0) {
            int lastdigit = temp % 10;
            int lastDigitToThePowerOfNoOfDigits = 1;

            for (int i = 0; i < noofdigits; i++) {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastdigit;
            }

            sum = sum + lastDigitToThePowerOfNoOfDigits;

            temp = temp / 10;
        }

        if (sum == n) {
            return true;
        }
        return false;
    }


    public static boolean isArmStrng(int n) {
        int noofdigits = order(n);
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, noofdigits);
            temp = temp / 10;

        }
        return sum == n;
    }

    private static int power(int r, int noofdigits) {
        if (noofdigits == 0) {
            return 1;
        }
        if (noofdigits % 2 == 0)
            return power(r, noofdigits / 2) * power(r, noofdigits / 2);
        return r * power(r, noofdigits / 2) * power(r, noofdigits / 2);
    }

    private static int order(int n) {
        int k = 0;
        while (n != 0) {
            k++;
            n = n / 10;
        }
        return k;
    }
}
