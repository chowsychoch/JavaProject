package udemy.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i : candyType){
            if ( !hashSet.contains(i)){
                hashSet.add(i);
            }
        }
        return Math.min(hashSet.size(), candyType.length /2 );
    }
}
