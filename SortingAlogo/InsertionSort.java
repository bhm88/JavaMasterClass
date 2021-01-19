package SortingAlogo;

public class InsertionSort {
    //like playing cards and inserting
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 3, 5, 2, 1};
        System.out.println("array before sorting ");
        print(arr);
        insertionSort(arr);
        System.out.println("array after insertion  sorting ");
        print(arr);
        System.out.println();
    }
}

