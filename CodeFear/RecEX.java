package CodeFear;

public class RecEX {
    public static void main(String[] args) {
        System.out.println(getRec("hello"));
    }

    public static String getRec(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(0) + "$" + getRec(s.substring(1));
    }
}
