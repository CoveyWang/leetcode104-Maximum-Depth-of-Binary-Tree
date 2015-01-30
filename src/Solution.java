
//Definition for binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        return dfsTree(root, 0);
    }

    public int dfsTree(TreeNode treeNode, int depth) {
        if (treeNode == null) {
            return depth;
        }
        return Math.max(dfsTree(treeNode.left, depth + 1), dfsTree(treeNode.right, depth + 1));
    }
}

