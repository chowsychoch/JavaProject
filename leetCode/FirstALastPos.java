package udemy.leetCode;

public class FirstALastPos {
    public int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findingStartIndex(nums,target);
        result[1] = findingEndIndex(nums,target);
        return result;
    }

    public int findingStartIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end ) / 2;
            if (nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1 ;
            }

            if (nums[mid] == target ){
                index = mid;
            }

        }
        return index;
    }

    public int findingEndIndex(int[] nums, int target){
        int index= -1;
        int start = 0;
        int end = nums.length -1 ;
        while (start <=end){
            int mid = (start + end ) /2 ;
            if (nums[mid] <=target){
                start = mid +1;
            }else{
                end = mid -1 ;
            }

            if (nums[mid] == target){
                index =mid;
            }
        }
        return index;
    }

}
