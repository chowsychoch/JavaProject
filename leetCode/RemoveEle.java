package udemy.leetCode;

public class RemoveEle {
    public int removeElement(int[] nums, int val) {
        /*
        int left = 0;
        int right = nums.length - 1 ;
        int temp = right;
        int count = nums.length;

        while (left <= right){
            count--;
            if (nums[right] == val){
                right--;
                //System.out.println("right is equals to val");
                continue;
            }
            //System.out.println("Below continue" + left);

            if(nums[left] == val){
                nums[left] = nums[right];
                right--;

            }
            else{
                count++;
            }
            left++;


        }
        return count;
        */

        //Solution 2
        int count = 0;
        int left =0;
        int right = nums.length;
        while (left <right){
            if (nums[left] == val){
                nums[left] = nums[right -1];
                right--;
            }else{
                left++;

            }
        }
        return right;

    }
}
