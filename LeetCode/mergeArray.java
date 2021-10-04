package udemy.LeetCode;

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        /*merge(nums1,m,nums2,n);
        int [] nums1 = {0};
        int [] nums2 = {1};*/
        System.out.println("jello");
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num2ind = n -1;
        int num1ind = m -1;
        for (int i = nums1.length-1; i > 0; i--){
            if (n == 0){
                System.out.println("helllo");
                System.out.println(Arrays.toString(nums1));
                break;
            }else if ( m== 0 ){
                System.out.println("helllllllo");
                System.out.println(Arrays.toString(nums2));
                break;
            }else {
                ///not use nums2 [ ] compare nums 1 [ nums1.length ] nut nums [ m ]
                if (nums2[num2ind] > nums1[num1ind]){
                    nums1[i] = nums2[num2ind];
                    num2ind--;
                }else {
                    nums1[i] = nums1[num1ind];
                    num1ind--;
                }
            }
            System.out.println(Arrays.toString(nums1));
        }

    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int n_pointer = n -1 ;
        int m_pointer = m -1 ;

        for (int i = nums1.length - 1 ; i >=0 ; i--){

            if ( n_pointer < 0){
                break;
            }
            if ( m_pointer >=0 && nums2[n_pointer] < nums1[m_pointer]){
                nums1[i] = nums1[m_pointer];
                m_pointer--;

            }else{
                nums1[i] = nums2[n_pointer];
                n_pointer--;
            }
        }

    }
}



