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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        Queue<Integer> sum = new LinkedList<>();
        Queue<TreeNode> path = new LinkedList<>();
        path.add(root);
        sum.add(root.val);
        while (!path.isEmpty()) {
            TreeNode node = path.poll();
            int nodeSum = sum.poll();
            if (nodeSum == targetSum && node.right == null && node.left == null) {
                return true;
            }
            if (node.left != null) {
                path.add(node.left);
                sum.add(node.left.val + nodeSum);
            }
            if (node.right != null) {
                path.add(node.right);
                sum.add(node.right.val + nodeSum);
            }
        }
        return false;
    }
}
