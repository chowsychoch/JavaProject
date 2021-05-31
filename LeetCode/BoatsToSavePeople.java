package udemy.LeetCode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int numBoats = 0;
        int i = 0;
        int j = people.length - 1 ;

        while ( i <= j ){
            if ( people[i] + people [j] <= limit){
                i++;
                j--;
            }else{
                j--;
            }
            numBoats++;
        }
        //System.out.println("B" + numBoats);
        return (numBoats);
        /*int peopleIdx = 0;
        int maxLimit = limit;
        int numBoat = 0;
        int count = 0;
        while ( peopleIdx < people.length){
            maxLimit = maxLimit - people[peopleIdx];

            if ( maxLimit >= 0){
                count++;
                if (count == 2){
                    numBoat++;
                    count= 0;
                }
                peopleIdx++;
            }else if ( maxLimit < 0){
                numBoat++;
                count = 0;
            }
            peopleIdx++;
        }
        System.out.println("numBoat" + numBoat);
        return numBoat;*/

    }
}
