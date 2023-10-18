/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return r;
    }

    private int r = 0;
    int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        r = Math.max(r, a + b);
        return 1 + Math.max(a ,b);
    }
}
