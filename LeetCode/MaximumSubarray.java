package udemy.LeetCode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        if ( nums.length == 1 )return nums[0];

        for (int i = 0 ; i < nums.length  ; i++){
            int curr = 0;
            for (int j = i; j <nums.length; j++){
                curr+= nums[j];
                sum = Math.max(sum, curr);
            }
        }
        return sum;
    }

    public int maxSubArray1(int[] nums){
        int curr = nums[0];
        int max = nums[0];

        for (int i = 1 ;i < nums.length ; i++){
            int num  = nums[i];
            curr = Math.max(num, curr + num);
            max = Math.max(max, curr);
        }
        return max;
    }
}
