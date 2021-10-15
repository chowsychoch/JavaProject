package udemy.LeetCode;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;

        String base = "";
        for (int i = 0; i < strs.length; i++){
            if (strs[i].length() < min){
                min = strs[i].length();
                base = strs[i];
            }
        }
        String s = "";


        for (int j = 0; j < base.length(); j++){
            int i = 0;

            for (i = 0; i < strs.length; i++){
                System.out.println(strs[i].charAt(j ));
                if (strs[i].charAt(j) != base.charAt(j))return s;
                System.out.println("end" + i +" " +strs.length);

            }

            s+=strs[i - 1 ].charAt(j);
            System.out.println("s"+s);
        }

        return s;


    }
}
