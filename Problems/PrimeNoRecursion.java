package Problems;

import java.util.Scanner;

public class PrimeNoRecursion {
    static int count = 0, i = 1;

    int primeOrNot(int num) {
        if (i <= num) {
            if (num % i == 0) {
                count++;
            }
            i++;
            primeOrNot(num);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeNoRecursion p = new PrimeNoRecursion();
        int c = p.primeOrNot(n);
        if (c == 2)
            System.out.println("prime number ");
        else
            System.out.println("Not a prime number ");
    }
}
