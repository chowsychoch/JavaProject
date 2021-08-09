package udemy.LeetCode;

public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion s = new ZigZagConversion();
        //s.convert("PAYPALISHIRING",4);
        s.convert2("PAYPALISHIRING",3);
    }
    public String convert(String s, int numRows) {

        if (numRows ==1 || numRows >= s.length())return s;

        char[] c = s.toCharArray();
        int len = c.length;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i =0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }
        int idx = 0;
        while (idx < len){
            for (int i =0; i < numRows && idx < len;i ++){
                sb[i].append(c[idx++]);
                //System.out.println(sb[i].toString());
            }
            for (int i = numRows -2; i>=1 && idx <len; i--){
                sb[i].append(c[idx++]);
            }
        }

        for (int i = 1; i <sb.length; i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }

    public String convert2(String s, int numRows){
        int length = s.length();
        if(numRows > length || numRows <= 1 ){
            return s;
        }
        char[] zig= new char[length];
        int count = 0;
        int interval = 2 * numRows -2 ;
        for (int i=0; i< numRows ; i++){
            int step = interval -2 * i ;
            for (int j = i; j < length; j+=interval){
                zig[count]= s.charAt(j);
                System.out.println(zig[count]);
                count++;
                if ( step> 0 && step < interval && j + step < length){
                    zig[count] = s.charAt(j + step);
                    System.out.println("Inside"+zig[count]);
                    count++;
                }
            }
        }
        return new String(zig);

    }

}
