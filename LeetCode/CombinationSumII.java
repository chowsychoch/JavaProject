package udemy.LeetCode;

import java.util.*;

public class CombinationSumII {
    Set<List<Integer>> hashed =new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        if ( candidates == null || candidates.length == 0 ||candidates.length > 100 )return results;

        List<Integer> current = new ArrayList<>();
        backtracker(candidates, target, 0, current, results);
        return results;
    }

    private void backtracker(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>>results){
        // base case
        if (target < 0){
            return;
        }
        //goals
        if (target == 0){
            results.add(new ArrayList<>(current));
            return;
        }
        //
        for (int i = index; i < candidates.length; i++){
            if(i == index || candidates[i] != candidates[i -1 ]){

                current.add(candidates[i]);
                backtracker(candidates, target - candidates[i], i + 1 , current, results);
                current.remove(current.size() -1 );
            }
        }
    }



}
