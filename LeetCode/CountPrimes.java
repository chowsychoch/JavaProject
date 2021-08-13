package udemy.LeetCode;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes c = new CountPrimes();
        System.out.println(c.countPrimes(10));

    }
    //a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
    public int countPrimes(int n){
        int count = 0;
        for (int i = 2; i < n ; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;

    }

    private boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= n /2 ; i++){
            if ( n % i == 0 ){
                System.out.println("n is not prime" + n);
                flag = false;
                break;
            }
        }
        System.out.println("n is " + n + "flag" + flag);
        return flag;
    }

    public int countPrimes1(int n) {
        boolean[] nums = new boolean[n];
        //for (int i = 0; i < nums.length ; i++){
          //  nums[i] = true;
        //}

        for (int i = 2; i * i < nums.length ; i++){
            if (!nums[i]){
                for (int j = i; j * i < nums.length; j++){
                    nums[i * j ] = true;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < nums.length ; i++) {
            if (!nums[i]) {
                count++;
            }
        }
        return count;

    }
}
