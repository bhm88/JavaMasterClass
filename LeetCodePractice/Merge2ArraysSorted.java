package LeetCodePractice;

public class Merge2ArraysSorted {
    static void merge(int nums1[], int m, int nums2[], int n) {

        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
        for (int k : nums1) {
            System.out.println(k);
        }
    }


    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 0, 0, 0};
        int num2[] = {2, 5, 6};
        merge(num1, 3, num2,3);


    }
}
