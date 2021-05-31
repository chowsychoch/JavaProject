package udemy.leetCode;

public class SquareX {
    public int mySqrt(int x) {
        if ( x < 1 ) return x;
        long start = 1;
        long end = x;
        long mid = 0;

        while (start <= end ){
            //System.out.println("e" + end);
           // System.out.println("s" + start);
            mid = start + (end -start ) / 2;
            //System.out.println(mid);

            if ( mid * mid == x){
                //System.out.println(mid);
                return ( int )mid;
            }else if ( mid * mid > x ){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if ( end * end  > x ){
            System.out.println(start);
            return (int) start;
        }else{
            System.out.println(end);
            return (int) end;
        }
    }
}
