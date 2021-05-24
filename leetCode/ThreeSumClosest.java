package udemy.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        //sort the array
        Arrays.sort(nums);
        //
        ArrayList<Integer> arr = new ArrayList<>();
        // loop over til length - 2
        for (int i =0; i < nums.length -2;i++){
            //for each eleemnt
            int low = i +1 ;
            int high = nums.length - 1 ;
            int sum = target - nums[i];

            while (low < high){
                if (nums[low] + nums[high] == sum){
                    return target;
                }else{
                    arr.add((nums[low] + nums[high] + nums[i]));
                    System.out.println(arr.get(i));
                }
                low++;
                high--;
            }
        }
        int result = 0;
        //sorted sum
        for (int i=0; i < arr.size();i++){
            if (arr.get(i) > target){
                if (arr.get(i - 1) - target> arr.get(i) - target){
                    result = arr.get(i);


                }else{
                    result = arr.get(i-1);
                }

            }
        }
        return result;
        // for (i)
        //set second as nums[i+1]
        //set third as length - 1 ;
        //num[1] + num[2] + num[3] == target
        //num[2] + num[3] = target - num[1]

        //while low < high
        //if num[2] + num[3] == target - num[1]
        //return target

        //else array.add (add them up )

        //start ++
        //end --


        //loop over the array list the sum
        //if ele >= target break; compare the ele - 1 and element

    }
}
