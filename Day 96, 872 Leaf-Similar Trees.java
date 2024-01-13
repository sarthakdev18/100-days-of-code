class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        leafSimilar(root1, leaves1);
        leafSimilar(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void leafSimilar(TreeNode node, List<Integer> leaves) {
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }

        leafSimilar(node.left, leaves);
        leafSimilar(node.right, leaves);
    }
}