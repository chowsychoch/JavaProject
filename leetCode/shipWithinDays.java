package udemy.leetCode;

public class shipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int start = 1;
        int end = Integer.MAX_VALUE;
        int retVal = 0;
        while ( start <= end ){
            int mid = start + (end - start )/2;
            if (canShipWithinDays(weights, mid, days)){
                //System.out.println("S" + start);
                //end = mid - 1;
                System.out.println("M" + mid);

                retVal = mid;
                end = mid -1;
                //return mid;
            }else{
                System.out.println("False");
                start = mid + 1;
            }
        }
        System.out.println("start end " + retVal);
        return retVal;

    }

    private boolean canShipWithinDays(int[] weights, int MidWeight, int LimitDays){
        int AccDays = 0;
        int AccWeight = 0;
        for (int weight: weights){
            AccWeight+=weight;
            if (AccWeight > MidWeight){
                ++AccDays;
                AccWeight = weight;
            }

        }
       System.out.println("MidWeight" + MidWeight);
        System.out.println("Acc Day " + AccDays );
        return ( AccDays <= LimitDays);

    }

}
