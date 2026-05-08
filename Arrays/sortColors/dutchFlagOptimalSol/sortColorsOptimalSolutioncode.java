package Arrays.sortColors.dutchFlagOptimalSol;

public class sortColorsOptimalSolutioncode {
     public static void main(String[] args){
        int nums[] = {2,0,2,1,1,0};
        optimalDutchFlag(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void optimalDutchFlag(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;

        while (mid<=high) {
            if (nums[mid]==0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int a , int b){
        int temp = 0;
        temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
