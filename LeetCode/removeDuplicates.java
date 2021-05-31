package udemy.LeetCode;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1){
            return nums.length;
        }

        int index = 1;
        for (int i = 0; i < nums.length - 1 ; i++){
            if(nums[i] != nums[i+1]){
                nums[index] = nums[i+1];
                index++;
            }
        }
        return index;
    }


}
