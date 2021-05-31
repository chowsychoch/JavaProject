package udemy.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> local = new LinkedList<>();
        for (int i = 0; i < nums.length - 2 ; i++){
            if (i == 0 || (i>0 && nums[i] != nums[i-1])){ // make sure the first ele is unique
                //set condition for second and third ele.
                int start = i +1;
                int end = nums.length - 1;
                //sums = nums[i] + nums[j] + nums[k]
                int sum = 0 - nums[i];
                while (start < end){
                    if (nums[start]  + nums[end] == sum){
                        //bingo case
                        local.add(Arrays.asList(nums[i],nums[start], nums[end]));
                        while(start < end  && nums[start] == nums[start+1]){
                            start++;
                        }
                        while (start <end && nums[end] == nums[end-1]){
                            end--;
                        }
                        start++;
                        end--;
                    }else if (nums[start] + nums[end] > sum){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return local;

    }
}
