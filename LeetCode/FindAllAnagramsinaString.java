package udemy.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        //HashMap < Char , count >
        Map<Character, Integer> s_hm = new HashMap();
        Map<Character, Integer> p_hm = new HashMap();
        List<Integer> output = new ArrayList<>();

        int ns = s.length(), np = p.length();

        if ( s.length() < p.length()) return output;

        //P Hash Map
        for (char item: p.toCharArray()){
            p_hm.put(item, p_hm.getOrDefault(item, 0) +1 );
        }

        for (int i = 0; i < s.length(); ++i){

            char ch = s.charAt(i);


            s_hm.put(ch, s_hm.getOrDefault(ch, 0) + 1);

            //System.out.println(s_hm);


            if ( i >= np){
                ch = s.charAt(i - np);
                //System.out.println(ch);

                if ( s_hm.get(ch) == 1 ){
                    s_hm.remove(ch);
                }else{
                    s_hm.put(ch, s_hm.get(ch) - 1);
                }

            }
            //System.out.println("p_hm： "+p_hm);
            //System.out.println(s_hm);

            if (p_hm.equals(s_hm)){
                output.add(i - np + 1);
            }

        }

        return output;

    }
}
