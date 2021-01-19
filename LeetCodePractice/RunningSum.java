package LeetCodePractice;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int res[] = (runningSum(arr));
        for (int r : res) {
            System.out.println(r);
        }
    }
}
