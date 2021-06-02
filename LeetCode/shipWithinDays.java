package udemy.LeetCode;

public class shipWithinDays {
    public int shipWithinDays(int[] weights, int days) {
        int min =0;
        int max=0;
        for (int w: weights){
            min = Math.max(min,w);
            max+= w;
        }
        int minWeight = 0;
        while (min <= max){
            int mid = min + (max -min )/2;
            int dayRequired = daysReqiredforAll(weights, mid);
            if ( dayRequired > days){
                min = mid +1 ;
            }else{
                minWeight = mid;
                max = mid -1;
            }
        }
        return minWeight;
    }

    private int daysReqiredforAll(int[] weights,int minWeight){
        int dayRequired= 1;
        int current = 0;
        for (int w : weights){
            current+=w;
            //System.out.println("curre" +current);
            if (current > minWeight){
                dayRequired ++;
                current =w;
                //System.out.println("curr after assign w is " + current);
                //System.out.println("minWeight"+minWeight);
            }
        }
        return dayRequired;

    }



    /*public int shipWithinDays(int[] weights, int days) {
        int start = 1;
        int end =0;
        for (int weight: weights){
            end+=weight;
        }
        System.out.println("end" + end);
        int retVal = 0;
        while ( start < end ){
            int mid = start + (end - start )/2;
            if (canShipWithinDays(weights, mid, days)){
                //System.out.println("S" + start);
                //end = mid - 1;
                System.out.println("M" + mid);
                retVal = mid;
                //end = mid -1;
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
        return ( AccDays == LimitDays);

    }*/

}
