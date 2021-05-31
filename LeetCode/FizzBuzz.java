package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    /*
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n ; i++){
            if ( i % 3 == 0 && i % 5 ==0){
                list.add("FizzBuzz");
            }else if ( i % 3 == 0){
                list.add(("Fizz"));
            }else if (i % 5 ==0){
                list.add("Buzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }*/

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
