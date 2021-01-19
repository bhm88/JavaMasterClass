package Problems;

public class BinarySerach {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        System.out.println(binSearch(arr, 0, n - 1, x));
    }

    public static int binSearch(int arr[], int l, int r, int x) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binSearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binSearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
