package Arrays.maxConsecutiveOnes.maxConsecutiveOnesOptimal;

public class maxConsecutiveOnesOptimalCode {
    public static void main(String[] args){
        int nums[]= {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.print(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k){
        int maxLength = 0;
        int left =0;
        int right = 0;
        int zero = 0;

        while (right < nums.length) {
            if (nums[right]==0) {
                zero ++;
            }
            while (zero > k) {
                if (nums[left]==0) {
                    zero --;
                }
                left++;
            }
            int length = right -left +1;
            maxLength = Math.max(length, maxLength);
            right++;
        }
        return maxLength;
    }
}
