package CodeFear;

public class SecondlargestElement {
    public static int secondLargest(int a[]) {

        int fl, sl;
        if (a[0] > a[1]) {
            fl = a[0];
            sl = a[1];
        } else {
            fl = a[1];
            sl = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > fl) {
                sl = fl;
                fl = a[i];
            } else if (a[i] > sl && a[i] < fl) {
                sl = a[i];
            }
        }
        return sl;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{45, 51, 28, 75, 49, 42}));
    }
}
