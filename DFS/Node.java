package udemy.DFS;

import java.util.List;

public class Node {
        public int val;
        public List<udemy.LeetCode.Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<udemy.LeetCode.Node> _children) {
            val = _val;
            children = _children;
        }
}
