package udemy.LeetCode;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome n = new LongestPalindrome();
        String ans = n.longestPalindrome("bba");
        System.out.println(ans);
    }
    public String longestPalindrome(String s) {
        if (s ==null || s.length() <1)return"";
        int start = 0;
        int end = 0;
        for (int i =0; i < s.length() ;i++){
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i, i+1);
            //System.out.println("i " + i);
           //System.out.println("len 1: " + len1 +" len 2: " +len2);
           int len = Math.max(len1, len2);
            //int len = len1;

            if ( len > end- start){
                start = i - (len-1) /2 ;
                end = i + len /2;
                //System.out.println("start " + start);
                //System.out.println("end" + end);
            }
        }
        return s.substring(start,end+1);
    }

    private int expandFromMiddle(String s, int left, int right){
        //System.out.println("s is " +s );
        if ( left < 0 && right >= s.length()) return 0;

        while (left>= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        //System.out.println("left is " + left + " right is " + right);
        //System.out.println("Result: " + (right - left - 1));
        return right - left - 1;
    }
}
