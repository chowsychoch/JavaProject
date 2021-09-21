package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
           List<Integer> dt = new LinkedList<>();
           for (int num:nums){
               dt.add(num);

           }
           backtracking(new LinkedList<>(),dt);
           return res;
    }

    private void backtracking(List<Integer> permutation, List<Integer> dt){
            if (permutation.size() == dt.size()){
                return;
            }
            for (Integer num: dt){
                List<Integer> tempP = new LinkedList<>(permutation);
                List<Integer> tempDt = new LinkedList<>(dt);
                tempP.add(num);
                tempDt.remove(num);
                backtracking(tempP, tempDt);
            }

    }
}
