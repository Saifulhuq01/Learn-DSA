package Arrays.maxConsecutiveOnes;

public class maxConsecutiveOnesCode {
    public static void main(String[] args){
        int nums[]= {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.print(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k){
        int maxLength =0;
        for (int i = 0; i < nums.length; i++) {
            int zero =0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j]==0) {
                    zero++;
                }
                if (zero<=k) {
                    int length = j-i+1;
                    maxLength = Math.max(maxLength, length);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
}
