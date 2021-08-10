package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    public static void main(String[] args) {
        generateParenthesis g = new generateParenthesis();
        System.out.println(g.generateParenthesis(3));
    }
    public List<String> generateParenthesis(int n) {
        // base case
        List <String> output_arr = new ArrayList<>();
        //
        backtrack(output_arr,"",0,0,n);
        return output_arr;
        }

    private void backtrack(List<String> output_arr, String current_string, int left, int right, int n ){
        System.out.println("lefft now" + left + "right now" + right + "current now" + current_string +"length" +current_string.length());
        if (current_string.length() == n * 2  ){
            output_arr.add(current_string);
            System.out.println("Return");
            System.out.println("current" + current_string);
            return;
        }

        if (left < n){
            System.out.println("left < n loop");
            backtrack(output_arr, current_string+"(",left+1, right,n);
        }

        if (right < left){
            System.out.println("right < left loop ");
            backtrack(output_arr, current_string+")", left, right +1, n);
        }
    }
}
