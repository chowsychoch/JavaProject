package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        if (numRows == 1) return res;

        for (int i = 1; i < numRows; i++){
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i ; j++){
                curr.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            curr.add(1);

            res.add(curr);

        }
        return res;
    }
}
