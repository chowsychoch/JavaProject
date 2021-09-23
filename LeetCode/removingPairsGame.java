package udemy.LeetCode;

import java.util.Stack;

public class removingPairsGame {
    public String removingPairsGame(int[] numbers){
        Stack<Integer> stack = new Stack<>();
        int count = 0 ;
        for (int i = 0; i < numbers.length ; i ++){
            if (stack.isEmpty() || stack.peek() != numbers[i] ){
                stack.push(numbers[i]);
                count++;
            }else{
                stack.pop();
            }
        }

        if (count % 2 == 0){
            return "B";
        }else{
            return "A";
        }

    }

}
