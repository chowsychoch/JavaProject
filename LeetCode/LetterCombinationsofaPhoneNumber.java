package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    String[] keyboard = new String[]{"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> results = new LinkedList<>();
        if (digits == null || digits.length() == 0)return results;
        StringBuilder sb = new StringBuilder();
        dfs(results, 0, sb, digits);
        return results;
    }

    private void dfs(List<String> results, int index, StringBuilder sb, String digits){
        //goals or base case
        if (index == digits.length() ){
            results.add(sb.toString());
            return;
        }
        String letters = keyboard[digits.charAt(index) - '0'];
        // System.out.println(digits.charAt(index));
        // System.out.println("letter is " + letters);
        for (int i =0; i < letters.length(); i++){
            char c = letters.charAt(i);
            //System.out.println("appended: " + c);
            sb.append(c);
            //System.out.println(sb);
            dfs(results,index + 1 ,sb, digits);
            //System.out.println("before sb: " + sb);
            //System.out.println("To be deleted: "+sb.charAt(sb.length() -1 ));
            //System.out.println("deleted: "+sb.deleteCharAt(sb.length() -1 ));
            //System.out.println(" after sb: " + sb);

            sb.deleteCharAt(sb.length() -1 );
        }
    }
}
