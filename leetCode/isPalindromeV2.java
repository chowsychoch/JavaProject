package udemy.leetCode;

public class isPalindromeV2 {
    public boolean isPalindrome(String s){

        String fixed_string = "";
        for (char c : s.toCharArray()){
            if ( Character.isDigit(c) || Character.isLetter(c)){
                fixed_string+=c;
            }
        }
        fixed_string = fixed_string.toLowerCase();

        int a_pointer = 0;
        int b_pointer = fixed_string.length() - 1 ;
        //System.out.println("String:" + fixed_string);
        while (a_pointer <= b_pointer){
            System.out.println("a" + a_pointer + "b" +b_pointer);

            if (fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)){
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        System.out.println("T");
        return true;

    }
}
