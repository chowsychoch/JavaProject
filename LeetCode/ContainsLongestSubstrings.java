package udemy.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsLongestSubstrings {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet();
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        while ( b_pointer < s.length()){
            if ( !hs.contains(s.charAt(b_pointer))){
                //
                hs.add(s.charAt(b_pointer));
                b_pointer++;
            }else{
                hs.remove(s.charAt(a_pointer));
                a_pointer++;
            }
            max = Math.max(hs.size(),max);

        }
        //System.out.println(max);
        return max;
    }

    public int lengthOfLongestSubstringV2(String s ){
        HashMap<Character, Integer> hm = new HashMap<>();
        int a_pointer =0;
        int b_pointer =0;
        int max= 0;

        while ( b_pointer < s.length()){
            if ( hm.containsKey(s.charAt(b_pointer))){
                a_pointer = Math.max(hm.get(s.charAt(b_pointer)),a_pointer );
            }
            max = Math.max(b_pointer - a_pointer +1,max);
            hm.put(s.charAt(b_pointer), b_pointer+1);
            b_pointer++;
        }
        //System.out.println("ma" + max);
        return max;

    }

    public int lengthOfLongestSubstringV3(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }

}
        /*
        HashMap<Character, Boolean> h = new HashMap<>();

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
        return  MaxNumString; */



