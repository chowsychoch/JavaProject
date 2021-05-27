package udemy.leetCode;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char [] c = s.toCharArray();
        if (s.length() <=1 )return s;
        //Two-pointer approaches
        int left = 0;
        int right = s.length() -1;


        while (left < right){
            while (left <right && !Character.isLetter(c[left]))left++;
            while (left < right && !Character.isLetter((c[right])))right--;
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;

        }
        String ans = new String(c);
        System.out.println(ans);
        return ans;
    }
}
