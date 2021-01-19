package Problems;

public class RemoveDupsGeeksSorted {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
        int j = dupsRemove(arr);
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int dupsRemove(int arr[]) {

        int n = arr.length;

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];

        return j;
    }
}
