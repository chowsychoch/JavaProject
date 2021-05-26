package udemy.leetCode;

public class RotatedSortedArray {
    public int search(int[] nums, int target) {
        //edge case
        if (nums== null || nums.length == 0)return -1;
        int left = 0;
        int right = nums.length -1;

        while (left < right){
            //it breaks when we find the smallest element of array.
            int midpoint = left + (right -left) /2 ;
            //Check the element in the mid point is greater than right hand side
            //Normal case: sorted array, right hand side is always greater than midpoint --> assign right to midpoint
            //Rotated case: move left point to midpoint + 1;
            if (nums[midpoint] > nums[right]){
                left = midpoint + 1;
            }else{
                right = midpoint;
            }
            System.out.println("Mid point we get here is " + midpoint);
        }

        System.out.println("left now is " + left);
        System.out.println("Right now is " + right);

        //reset to regular binary search
        int start = left;
        left =0;
        right = nums.length-1;
        if (target >= nums[start] && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }

        while (left <=right){
            int midpoint = left + (right -left)/2;
            if( nums[midpoint] == target){
                return midpoint;
            }else if (nums[midpoint] > target){
                right = midpoint - 1;
            }else{
                left = midpoint + 1;
            }
        }
        return -1;

    }
}
