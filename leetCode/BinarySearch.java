package udemy.leetCode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        /*
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while ( start <= end ){
             int mid = ( start + end ) / 2;
            if( nums[mid] == target){
                System.out.println(mid);
                return mid;
            }else if ( nums[mid] > target){
                end = mid - 1  ;
            }else{
                start = mid + 1 ;
            }
        }
        //System.out.println("ans"  + ans);
        return ans; */

            int low = 0;
            int high = nums.length - 1;

            while (low < high) {
                int mid = low + ((high-low)>>1);
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        System.out.println("low " + low  + " high " + high);
            return nums[high] == target? high : -1;
    }
}
