package LeetCodePractice;

public class MaxAvgSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        long max = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return (double) max / (double) k;
    }


    public static void main(String[] args) {
        int a[] = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(a, 4));
    }
}
