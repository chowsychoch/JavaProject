package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum n = new CombinationSum();
        n.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> results = new ArrayList<>();

        if ( candidates == null || candidates.length == 0)return results;
        List<Integer> current = new ArrayList<>();
        backtracker(candidates, 0, target, current, results);
        return results;
    }

    private void backtracker(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> results)
    {
        // base case
        if ( target < 0 ){
            return;
        }
        // goal
        if (target == 0 ){
            results.add(new ArrayList<>(current));
            return;
        }

        for ( int i = index; i < candidates.length ; i++){
            current.add(candidates[i]);
            backtracker(candidates, i, target - candidates[i], current, results);
            current.remove(current.size() - 1);
        }

    }
















    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backTracking(candidates, target, 0, new ArrayList<>(), res);
        System.out.println(res);
        return res;
    }

    private void backTracking(int[] candidates, int target, int current_Index, List<Integer> list, List<List<Integer>> res ){
        System.out.println("hey" +target);
        if ( target < 0){
            return;
        }

        if ( target == 0){
            res.add(new ArrayList<>(list));
        }
        for (int i = current_Index; i < candidates.length; i++){
            System.out.println("current " + i);
            list.add(candidates[i]);
            backTracking(candidates,  target - candidates[i], i , list, res );
            list.remove(list.size() - 1);
        }
    }
}
