package Problems;

public class ReverseInteger {
    public static void main(String[] args) {
        int input = 5678;
        int output = reverseInt(5678);
        System.out.println("Input : " + input + " Output : " + output);


    }

    public static int reverseInt(int num) {
        boolean isNegative = num < 0 ? true : false;
        if (isNegative) {
            num = num * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (num >= 1) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // get rid of last digit


        }
        return isNegative == true ? reverse * -1 : reverse;
    }
}
