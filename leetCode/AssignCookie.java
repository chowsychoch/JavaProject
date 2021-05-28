package udemy.leetCode;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        //Rearrange the array in order;
        Arrays.sort(g);
        Arrays.sort(s);
        int contentNum =0;
        if (s.length == 0 || s == null){
            //System.out.println("con" + contentNum);
            return contentNum;
        }

        int sizeIndex = 0;
        int greedIndex = 0;

        while ( sizeIndex < s.length && greedIndex < g.length){
            if (g[greedIndex] <= s[sizeIndex]){
                //
                contentNum++;
                greedIndex++;
                sizeIndex++;
                //if ( greedIndex == g.length){
                 //   break;
              //  }
            }else{
                sizeIndex++;
            }
        }
       // System.out.println("C" + contentNum);
        return contentNum;
    }
}
