/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) {
            return new ArrayList<>();
        }

        List<Integer> post = new ArrayList<>();
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            root = stack.pop();
            post.add(root.val);

            for(Node n : root.children) {
                stack.push(n);
            }
        }

        Collections.reverse(post);
        return post;
    }
}