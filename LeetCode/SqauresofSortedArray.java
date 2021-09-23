package udemy.LeetCode;

import java.util.Arrays;

public class SqauresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        for ( int i = 0 ; i < nums.length ; i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }

    //
    public int[] sortedSquares2(int[] nums){
        int left = 0, right = nums.length - 1, pointer = nums.length - 1;
        int[] results = new int[nums.length];
        while ( left <= right){
            if (Math.abs(nums[left]) > Math.abs(nums[right])){
                results[pointer] = nums[left] * nums[left];
                left++;
                pointer--;
            }else{
                results[pointer] = nums[right] * nums[right];
                right--;
                pointer--;
            }
        }
        return results;
    }
}
