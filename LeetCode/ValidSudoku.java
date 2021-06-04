package udemy.LeetCode;

import java.util.Arrays;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int box=0; box <9; box++){
            int[] map = new int[128];
            for (int row =0; row < 3; row++){
                for (int col =0; col < 3; col++){
                    char c = board[row + 3 * (box /3)][col + 3* (box % 3)];
                    if ( c != '.'){
                        if(map[c] >0){
                            return false;
                        }else{
                            System.out.println(c);
                            map[c]++;
                            System.out.println(Arrays.toString(map));
                        }
                    }
                }
            }
        }
        return true;
    }
}
