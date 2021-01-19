package SortingAlogo;

public class SelectionSort {
    //min element will be put first after first iteration
    //2 loops i ,j
    //j=i+1, compare and swap with i
    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int m_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    m_index = j;
                }
                int temp = a[m_index];
                a[m_index] = a[i];
                a[i] = temp;
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
        selectionSort(arr);
        System.out.println("array after selection sorting ");
        print(arr);
        System.out.println();
    }
}
