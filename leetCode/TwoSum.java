package udemy.leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i = 0; i< nums.length - 1; i++){
            for ( int j = i +1 ; j< nums.length; j++){
                if ( nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    // 2nd Approach

    public int[] twoSumSecond(int[] nums, int target){
        int[] ans = new int[2];
        Map<Integer,Integer> ValueExisted = new HashMap<>();
        for (int i=0; i < nums.length ; i++){
            int matchValue = target - nums[i];
            if (ValueExisted.containsKey(matchValue)){
                System.out.println("Value match");
                ans[0] = ValueExisted.get(matchValue);
                ans[1] = i ;
                return ans;
            }else{
                ValueExisted.put(nums[i],i);
            }
        }
        return ans;
    }
}
