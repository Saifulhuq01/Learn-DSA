package Arrays.maxSubArray;

public class maxSubArrayKadaneAlgo {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        kadaneAlgo(nums);
    }

    public static void kadaneAlgo(int[] nums){

        int cs = 0; int ms= Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];

            if (cs > ms) {
                ms = cs ;
            }
            if (cs < 0) {
            cs = 0;
            }
        }
        System.out.println("Max subarrays is : " + ms);
    }
}
