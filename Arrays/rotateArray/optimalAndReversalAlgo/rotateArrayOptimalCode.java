package Arrays.rotateArray.optimalAndReversalAlgo;

import java.util.Arrays;

public class rotateArrayOptimalCode {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.print(Arrays.toString(nums));
        
    }
    public static void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k% n;// this will help a edge case and very important like nums= {3,2,1} if k is 5 then we got an error
        reverse(nums, 0, n-1); // just reverse the entire array like 7654321
        reverse(nums, 0, k-1); // re-reverse a first 3 number on already reverse value like 765 -> 567 and remain same 4321
        reverse(nums, k, n-1);//re-reverse a that remainig value like 4321 ->1234 final o/p is 5671234


    }
    public static void reverse(int[] nums, int start, int end){

        while(start <= end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start ++;
            end --;
        }
    }

}
