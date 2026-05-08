package Arrays.rotateArray;

public class rotateArrayCode {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = (i + k) % nums.length;
            temp[val] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

}
