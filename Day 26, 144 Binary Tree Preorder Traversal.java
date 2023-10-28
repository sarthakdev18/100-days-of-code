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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }

        List<Integer> pre = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            pre.add(root.val);

            if(root.right != null) {
                stack.push(root.right);
            }

            if(root.left != null) {
                stack.push(root.left);
            }
        }

        return pre;
    }
}