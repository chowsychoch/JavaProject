package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    int[] key = {1,2,3,4,5,6,7,8,9};

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<>();
        if ( n == 0 )return results;
        List<Integer> curr = new ArrayList<>();
        backtracking(results, curr,k,n,0);
        return results;
    }

    private void backtracking(List<List<Integer>>results, List<Integer> curr, int k, int n,int index){
        //
        if ( n < 0 ){
            return;
        }

        if ( n == 0 && curr.size()  == k  ){
            // System.out.println("h");
            results.add(new ArrayList<>(curr));
            return;
        }

        for ( int i = index; i < key.length ; i++ ){
            System.out.println(key[i]);
            curr.add(key[i]);
            System.out.println(curr.toString());
            backtracking(results,curr, k, n - key[i], i+ 1);
            curr.remove(curr.size() - 1 );

        }

    }
}
