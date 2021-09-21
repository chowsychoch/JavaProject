package udemy.LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PermutationsII {
    Set<List<Integer>> results = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> dt = new LinkedList<>();
        for (int num:nums){
            dt.add(num);
        }
        backtracking(new LinkedList<>(),dt);
        return new LinkedList<>(results);
    }

    private void backtracking(List<Integer> permutation, List<Integer> dt){
        if (dt.size() == 0){
            results.add(permutation);
            return;
        }
        for(int i = 0 ; i < dt.size() ; i++){
            List<Integer> tempP = new LinkedList<>(permutation);
            List<Integer> tempDt = new LinkedList<>(dt);
            tempP.add(dt.get(i));
            tempDt.remove(dt.get(i));
            backtracking(tempP, tempDt);

        }
    }
}
