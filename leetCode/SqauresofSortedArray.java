package udemy.leetCode;

import java.util.Arrays;

public class SqauresofSortedArray {
    public int[] sortedSquares(int[] nums) {
        //System.out.println((int)Math.pow(2,2));
        int i = 0;
        int j= nums.length - 1;
        while( i < j ){
            //System.out.println(nums[i]);
            nums[i] = (int)Math.pow(nums[i], 2);
            nums[j] = (int)Math.pow(nums[j], 2);
            i++;
            j--;
        }

        if ( j - i == 0){
            System.out.println("hey");
            nums[i] = (int) Math.pow((nums[i]),2);
        }
        Arrays.sort(nums);

        return nums;
    }
}
