package udemy.LeetCode;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        if ( nums.length < 4 ) return result;

        for (int i =0; i < nums.length - 3; i++){

            if ( i!=0 && nums[i] == nums[i - 1])continue;

            for (int j = i + 1; j < nums.length -2; j ++){
                if ( j != i +1  && nums[j] == nums[j - 1]) continue;

                int start = j  +1 ;
                int end = nums.length - 1 ;

                while ( start < end ){
                    int sum = nums[i]  + nums[j] + nums[start] + nums[end];
                    //int mid = start + (end - start) /2;

                    if (sum > target ){
                        end-- ;
                        while ( start < end && nums[end] == nums[end + 1])end--;
                    }else if ( sum  < target){
                        start++;
                        while ( start< end && nums[start] == nums[start - 1])start++;
                    }else{
                        result.add(Arrays.asList(nums[i],nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                        while ( start < end && nums[start] == nums[start - 1])start++;
                        while ( start < end && nums[end] == nums[end + 1])end--;
                    }
                }
            }
        }
        //System.out.println(result);
        return result;

    }
}
