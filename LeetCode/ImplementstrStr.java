package udemy.LeetCode;

public class ImplementstrStr {
    public static void main(String[] args) {
        ImplementstrStr n = new ImplementstrStr();
        int an = n.strStr("a", "a");
        System.out.println(an);

    }

    public int strStr(String haystack, String needle){
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