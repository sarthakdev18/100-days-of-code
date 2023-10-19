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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        path(root, new StringBuilder(), list);
        return list;
    }

    private void path(TreeNode root, StringBuilder sb, List<String> list) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            list.add(sb.append(root.val).toString());
            return;
        }

        int len = sb.length();
        path(root.left, sb.append(root.val).append("->"), list);
        sb.setLength(len);
        path(root.right, sb.append(root.val).append("->"), list);
        sb.setLength(len);
    }
}