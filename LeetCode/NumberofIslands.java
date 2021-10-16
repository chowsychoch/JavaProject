package udemy.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberofIslands {

    private static final List<int []> Directions = Arrays.asList(
            new int[]{0, 1},
            new int[]{0, -1},
            new int[]{1, 0},
            new int[]{-1, 0}
    );
    public int numIslands(char[][] grid) {
        int count =0;
        int m = grid.length;
        if (m == 0 )return 0;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for (int row = 0; row < m; row++){
            for (int col = 0 ; col < n; col++){
                if (grid[row][col] == '1'){
                    count++;
                    grid[row][col] = '0';

                    q.add(new int[] { row, col});
                    //count++;
                    while (!q.isEmpty()){
                        int[] point = q.poll();
                        int pt_row = point[0];
                        int pt_col = point[1];

                        for (int[] direction: Directions){
                            int r =  pt_row + direction[0];

                            int c = pt_col + direction[1];


                            if ( r < 0 || c < 0 || r >= m || c >= n || grid[r][c] != '1'){
                                continue;
                            }
                            grid[r][c] = '0';
                            q.add(new int[] {r , c});
                        }

                    }

                }

            }
        }

        return count;


    }
}
