package udemy.leetCode;

public class isPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() <= 0 || s.isEmpty() )return false;
        // modify the input
        s = s.toLowerCase();
        // Two pointers approach
        int left = 0;
        int right = s.length() - 1;
        while (left < right ){
            s.charAt(right);
            s.charAt(left);
            if ( !Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left)) ){
                left++;
                continue;
            }
            if(!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right))){
                right--;
                continue;

            }
            if (s.charAt(left) != s.charAt(right)){
                System.out.println("Fal");
                return false;
            }else{
                right--;
                left++;
            }
        }
        System.out.println("T");
        return true;

    }
}
