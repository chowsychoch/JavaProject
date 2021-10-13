package udemy.LeetCode;

public class AddBinary {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int a_len = a.length() - 1 ;
        int b_len = b.length() - 1 ;
        int carry = 0;

        while ( a_len >= 0 || b_len >= 0){
            int sum = carry;

            if ( a_len >= 0){
                sum+=a.charAt(a_len) - '0';
                a_len--;
            }

            if ( b_len >= 0){
                sum+=b.charAt(b_len--) - '0';
            }

            carry = sum / 2;
            sum %=2;
            sb.insert(0, sum);

        }


        if ( carry > 0){
            sb.insert(0, carry);
        }

        return sb.toString();


    }
}
