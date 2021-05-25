package udemy.leetCode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int initial = nums[0] + nums[1] + nums[nums.length - 1];
        //sort the array
        Arrays.sort(nums);
        // loop over til length - 2
        for (int i =0; i < nums.length -2;i++){
            //for each eleemnt
            int low = i +1 ;
            int high = nums.length - 1 ;

            while (low < high){
                int current = nums[low] + nums[high]+ nums[i];
                if ( current > target){
                    high--;
                }else{
                    low++;
                }
                //abs return the absolute value
                if (Math.abs(current - target) < Math.abs(initial - target)){
                    initial = current;
                }
            }
        }
        return initial;
    }
}
