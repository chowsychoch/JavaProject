package udemy.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    public static void main(String[] args) {
        FibonacciNumber n = new FibonacciNumber();
        //System.out.println(n.fib(3));
        System.out.println(n.fibbbo(2));
    }
    //Dynamic Programming
    public int fib(int n) {
        if (n <= 1)return n;

        return fib(n - 1) + fib(n -2);
    }
    //memorization
    private int fibb(int n){
        Map<Integer, Integer> memo = new HashMap<>();
        if (n <= 1 ) return n;
        int result = fib(n -1 )+ fib(n-2);

        if (memo.containsKey(n)){
            return memo.get(n);
        }else{
            memo.put(n, result);
        }

        return result;
    }
    //iterative appraoch
    // f(0) = 0, f(1) = 1 , f (2) =  1 , f (3) = 1 + 1, f (4) = 2 + 1 = 3
    public int fibbo(int n){

        int fib = 0;
        int curr = 1;
        for (int i = 0; i < n; i ++){
            fib = fib + curr;
            curr = fib;
        }
        return fib;
    }
    public int fibbbo (int n) {
        int fib = 0;
        int a = 1;
        for(int i=0; i<n; i++) {
            //System.out.println("prev prev " + fib + " prev  " + a);
            int temp = fib;
            fib = fib + a;
            a = temp;
            //System.out.println("AFTER prev prev " + fib + " prev  " + a);
        }
        return fib;
    }
}
    //F(0) = 0, F(1) = 1
      //  F(n) = F(n - 1) + F(n - 2), for n > 1.