package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    List<String> res = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        findAll(res, s, 0);
        return res;
    }

    public void findAll(List<String> res, String word, int start){
        // add the result
        res.add(word);

        for (int i = start ; i< word.length(); i++){
            char[] wordArray = word.toCharArray();
            if (Character.isLetter(word.charAt(i))){
                if (Character.isUpperCase(word.charAt(i))){
                    wordArray[i] = Character.toLowerCase(word.charAt(i));
                    findAll(res, String.valueOf(wordArray), i+ 1 );
                }else{
                    wordArray[i] = Character.toUpperCase(word.charAt(i));
                    findAll(res, String.valueOf(wordArray), i+ 1 );
                }
            }
        }
    }
}
