/**
//94. Binary Tree Inorder Traversal
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Traversal(root, res);
        return res;
    }

    private void Traversal(TreeNode node, List<Integer> res) {
        if (node == null)
            return;
        Traversal(node.left, res);
        res.add(node.val);
        Traversal(node.right, res);
    }
}
