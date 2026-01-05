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
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> path = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();
        if (root == null)
            return 0;

        path.add(root);
        sum.add(root.val);
        int total = 0;
        
        while (!path.isEmpty()) {
            TreeNode node = path.poll();
            int nodeSum = sum.poll();
            if (node.left == null && node.right == null) {
                total += nodeSum;
            }
            if (node.left != null) {
                path.add(node.left);
                sum.add(node.left.val + nodeSum * 10);
            }
            if (node.right != null) {
                path.add(node.right);
                sum.add(node.right.val + nodeSum * 10);
            }
        }
        return total;
    }
}
