package udemy.LeetCode;

import java.util.Arrays;

public class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        while (start <= end){
            int mid = start + ( end -start) /2;
            if( canEatInTime(piles, mid, h) ){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean canEatInTime(int[] piles, int k, int h){
        int hours = 0;
        for (int pile : piles){
            int div = pile / k ;
            hours+= div;

            if ( pile % k != 0){
                ++hours;
            }
        }
        return hours <= h;

    }
}
