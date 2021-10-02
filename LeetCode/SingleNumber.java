package udemy.LeetCode;

import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        //O(n) Time complexity
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i: nums){
            hm.put(i, hm.getOrDefault(i,0) + 1 );
        }

        for (int i : nums){
            if ( hm.get(i) == 1 ) {
                return i;
            }
        }
        return 0;
    }

    public int singleNumber2(int[] nums) {
        int a = 0 ;
        for (int i: nums){
            a = a ^ i;
        }
        return a;
    }
}
