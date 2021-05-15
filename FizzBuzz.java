package udemy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result  = new ArrayList<String>();
        for(int i = 1 ; i <= n; i++) {
            String subres = "";
            if( i%3 == 0 ){
                subres += "Fizz";
            }
            if( i%5 == 0) {
                subres += "Buzz";
            }

            if(subres.equals("")){
                subres = Integer.toString(i);
            }

            result.add(subres);
        }

        return result;
    }
}
