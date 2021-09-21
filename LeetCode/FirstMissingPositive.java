package udemy.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public int firstMissing(int[] nums){
        if ( nums == null || nums.length == 0) return 1 ;
        int n = nums.length;
        boolean containOne = false;

        // step 1
        for (int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                containOne = true;
            }
            else if (nums[i] <= 0 || nums[i]  > n){
                nums[i] = 1;
            }
        }

        if ( !containOne )return 1;

        // step 2
        for (int i = 0;i < n; i++){
            int index = Math.abs(nums[i]) - 1 ;
            if (nums[index] > 0)nums[index] = -1 * nums[index];
        }

        //

        for(int i =0 ;i < n ;i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return n + 1;

    }
    public int firstMissingPositive(int[] nums){
        // Space & Time Complexity O(n)
        Set<Integer> set = new HashSet<>();
        boolean containOne = false;
        for (int i : nums){
            if ( i == 1){
                containOne = true;
            }
            set.add(i);
        }
        for(int i =1 ; i <= nums.length ; i++){
            if (!set.contains(i)){
                return i;
            }
            if (containOne && nums.length == i )return  i +1 ;

        }

        return -1;

    }
}
