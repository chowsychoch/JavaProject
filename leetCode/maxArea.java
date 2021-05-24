package udemy.leetCode;

public class maxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        if ( height.length < 2 ){
            return maxArea;
        }

        while (left < right){
            int area = (right - left ) * (Math.min(height[left],height[right]));
            if (maxArea < area){
                maxArea = area;
            }
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;
    }
}

// Time Complexity: O(n)
//Space Complexity: O(1)