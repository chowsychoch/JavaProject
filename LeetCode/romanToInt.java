package udemy.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        int sum = 0;
        int i = 0;
        while ( i < s.length()){
            String curr = s.substring(i, i+1);
            int currVal = hm.get(curr);
            int nextVal = 0;

            if (i + 1 < s.length()){
                String next = s.substring(i+1, i+2);
                nextVal = hm.get(next);
            }

            if (currVal < nextVal){
                sum = sum -  currVal + nextVal;
                i+=2;
            }else{
                sum = sum +  currVal;
                i+=1;
            }

        }
        return sum;
    }
}
