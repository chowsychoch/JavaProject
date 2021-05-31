package udemy.LeetCode;

import java.util.Arrays;

public class FirstAndLastPos {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = nums.length -1 ;
        System.out.println("end" + end);

        while (start < end){
            int mid = (start + end) / 2;
            if( target == nums[mid]){
                result[0] = mid;
                //for exmaple 3
                int StartingIndex = mid;

                while (StartingIndex >= 0){
                    System.out.println("cool");
                    if (nums[StartingIndex] == nums[StartingIndex +1]){
                        StartingIndex++;

                    }else if ( nums[StartingIndex] == nums[StartingIndex -1]){
                        StartingIndex--;
                        //result[1] = StartingIndex;
                        //Arrays.sort(result);
                        //return result;
                    }else{
                        result[1] = StartingIndex;
                        Arrays.sort(result);
                        return result;
                    }
                }

            }
            else if ( target < nums[mid]){
                end = mid -1 ;
            }else{
                start = mid + 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        Arrays.sort(result);
        return result;

    }

}
