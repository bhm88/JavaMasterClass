package SortingAlogo;

//{4, 3, 5, 2, 1};
//for every itration maximum element wil be at last/sorted

//2 loops i,j,inner loop--j=n-1-j,compare and swap j>j+1 then swap
public class BubbleSort {
    public static void bubblesort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void recursivebubblesort(int[] arr,int n) {
        if(n==1){
            return ;
        }
        for(int i=0;i<n-1;i++){

            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            recursivebubblesort(arr,n-1);
        }
    }
    public static void efficientbubblesort(int[] arr,int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
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
       // bubblesort(arr);
        System.out.println();
       // System.out.println("array after sorting ");
       // print(arr);
       // recursivebubblesort(arr,arr.length);
        efficientbubblesort(arr,arr.length);
        System.out.println("array after recursive sorting ");
        print(arr);
    }
}
