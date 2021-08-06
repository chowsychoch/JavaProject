package udemy.LeetCode;

public class ImplementstrStr {
    public static void main(String[] args) {
        ImplementstrStr n = new ImplementstrStr();
        int an = n.strStr("a", "a");
        System.out.println(an);

    }
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        char startChar = needle.charAt(0);
        int len = needle.length();
        for (int i =0; i < haystack.length() - len + 1; i++){
            //System.out.println("time");
            String ans = "";
            if (haystack.charAt(i) == startChar){
                //System.out.println("match");


                if (haystack.length() > needle.length()){
                    ans = haystack.substring(i, (i +len)  );

                }else{
                    ans = haystack.substring(i, haystack.length() );
                }
                //System.out.println(ans);
                if (ans.equals(needle)){
                    //System.out.println("hey");
                    return i;
                }
            }
        }
        //Nothing found
        return -1;
    }

    public int strStr2(String haystack, String needle){
        if (needle.isEmpty())return 0;
        int m = haystack.length();
        int n = needle.length();

        if ( m < n ){
            return -1;
        }

        for (int i =0; i < m - n ; i++){
            int j;
            for (j=0; j < n ; j++){
                if (haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            if (j == n){
                return i;
            }
        }
        return -1;

    }

}

//Input: haystack = "hello", needle = "ll"
//      Output: 2

//Input: haystack = "aaaaa", needle = "bba"
//        Output: -1


//Input: haystack = "", needle = ""
//        Output: 0