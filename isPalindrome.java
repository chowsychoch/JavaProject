package udemy;

public class isPalindrome {
    public static void main(String[] args){

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int input = number;
        int reverse = 0;
        while (number !=0 || number > 0){
            //extract last digit
            int lastDigit = number %10;
            //increase the place value
            reverse = reverse * 10;
            // add the value
            reverse = reverse + lastDigit;
            //cut off the last digit
            number = number / 10;
        }
       // System.out.println("reverse number is " + reverse);
        //System.out.println("number " + input);

        if (input < 0 ){
            input = -input;
            reverse = -reverse;
        }
        boolean ans = input - reverse == 0? true: false;
        return ans;
    }


}
