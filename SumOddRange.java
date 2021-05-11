package udemy;

public class SumOddRange {
    public static void main(String[] args){
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));

    }

    public static boolean isOdd(int num){
        boolean ans = (num <0) ? false :(num % 2 !=0)? true : false;
        return ans;
    }
    public static int sumOdd(int start , int end){
        int sum =0;
        //check end number
        if (end < start || start < 0 ){
            return -1;
        }

        for (int i =start; i<=end ; i++){
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
