package udemy.LeetCode;

import java.util.HashMap;

public class ContainsLongestSubstrings {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> h = new HashMap<>();
        String fixedString = "";
        for ( int i=0; i< s.length(); i++){
            fixedString+= s.charAt(i);
        }
        System.out.println(fixedString);

        int MaxNumString = 1;
        int current = 1;
        for (char c :fixedString.toCharArray()){
            if (!h.containsKey(c)){
                //false
                h.put(c, true);
                ++current;
            }else{
                if ( current > MaxNumString){
                    MaxNumString = current;
                    current = 1;
                }
            }
        }
        if (current > MaxNumString){
            MaxNumString = current;
        }

        if ( MaxNumString == s.length()){
            return MaxNumString;
        }else{
            MaxNumString--;
        }
        System.out.println(MaxNumString);
        return  MaxNumString;
    }

}
