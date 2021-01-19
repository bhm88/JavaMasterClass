package LeetCodePractice;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Integer max1 = null, max2 = null, max3 = null;

        for (Integer n : nums) {
//            if (n.equals(max1) || n.equals(max2) || n.equals(max3))
//                continue;

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }

        }
        return max3 == null ? max1 : max3;
    }

    public static void main(String[] args) {
        int nums[] = {30, 25, 10};
        //Integer nums[] = {null, null, null};
        System.out.println(thirdMax(nums));
    }
}
