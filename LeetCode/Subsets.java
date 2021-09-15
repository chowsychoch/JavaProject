package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        if ( nums == null || nums.length == 0 )return results;
        backtracking(results, 0, curr, nums);
        return results;
    }

    private void backtracking(List<List<Integer>> results, int index, List<Integer> curr, int[] nums){

        results.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length ; i++){
            System.out.println("nums[i] is " + nums[i]);
            curr.add(nums[i]);
            backtracking(results, i+1, curr, nums);
            System.out.println("pop out of loop");
            System.out.println("i is :" +i  +" curr "+ curr.get(curr.size() - 1 ));
            curr.remove(curr.size() - 1 );
        }
        System.out.println("end");
    }
}
