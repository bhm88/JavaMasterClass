package CodeFear;

public class CloudJump {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0,  1, 0};
        System.out.println(cloudJump(arr));
    }

    public static int cloudJump(int[] a) {
        int jumps = 0;

        int i = 0;
        while (i < a.length - 1) {
            if (i + 2 == a.length || a[i + 2] == 1) {
                i++;
                jumps++;
            } else {
                i += 2;
                jumps++;
            }

        }
        return jumps;
    }
}
//
//    public static void main(String[] args) {
//
//        int arr[] = {0, 0, 1, 0, 0, 1, 0};
//
//    }


