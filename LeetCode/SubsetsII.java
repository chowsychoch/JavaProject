package udemy.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        if ( nums == null || nums.length == 0) return results;
        backtracking(results, 0, curr, nums);
        return results;
    }

    private void backtracking(List<List<Integer>> results, int index, List<Integer> curr, int[] nums){
        results.add(new ArrayList<>(curr));

        for ( int i = index; i < nums.length ; i++){
            if ( i == index || nums[i] != nums[ i - 1]){
                curr.add(nums[i]);
                backtracking(results, i+ 1, curr, nums);
                curr.remove(curr.size() - 1 );
            }
        }
    }
}
