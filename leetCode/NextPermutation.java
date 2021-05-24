package udemy.leetCode;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // edge case
        if(nums ==null || nums.length==0 )return;
        // find the first descending value
        int i = nums.length - 2 ;
        while (i >=0 && nums[i+1] <= nums[i]){
            i--;
        }
        System.out.println("i is " + i );
        // found i
        //find j
        if ( i >= 0){
            int j = nums.length -1;
            while (j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        //reverse the remaining descedning -1
        reverse(nums,i+1);
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int i, int j){
       // System.out.println("i is ***" + i);
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i){
        int j = nums.length -1;
        while ( i <j){
            System.out.println("rever func i " + i);
            swap(nums,i++,j--);
        }
    }
}
