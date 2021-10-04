package udemy.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        // find which nums has a shorter length
        if (nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        //
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int item: nums1){
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }

        int i = 0 ;
        for ( int item: nums2){
            if (hm.containsKey(item) && hm.get(item) > 0){
                nums1[i] = item;
                i++;
                hm.put(item, hm.get(item)-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, i);


    }
}
