package Arrays.twoSum;

import java.util.Arrays;

public class twoSumCode {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j-1] + nums[j] == target) {
                    return new int[] {j-1 ,j};
                }
            }
        }
        return null;
    }
}
