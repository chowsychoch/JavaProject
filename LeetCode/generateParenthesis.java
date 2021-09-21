package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class generateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> results = new LinkedList<>();
        String curr = "";
        //int left = 0;
        //int right = 0;
        backtracking(results, curr, n, 0, 0);
        return results;
    }

    private void backtracking(List<String> results, String curr, int n, int left, int right){
        System.out.println(curr);
        if (curr.length() == n * 2 ){
            results.add(curr);
            System.out.println("results added and return");
            return;
        }

        if (left < n){
            System.out.println("Entering the left ");
            backtracking(results, curr+"(", n, left + 1, right);
        }
        System.out.println("is right < left");
        if (right < left){
            System.out.println("Entering the right ");
            backtracking(results, curr+")", n,  left, right + 1 );
        }
        System.out.println("Oh im done");
    }
}
