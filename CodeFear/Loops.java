package CodeFear;

public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 100) {
            System.out.println("print " + count);
            count++;
        }


        String str1 = "bgjhgsakjahjklshakljshakl";

        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.println("print chars in reverse order " + str1.charAt(i));
        }
    }
}
