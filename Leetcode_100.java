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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode pnode = queue1.poll();
            TreeNode qnode = queue2.poll();
            if (pnode == null && qnode == null) {
                continue;
            }
            if (pnode == null || qnode == null || pnode.val != qnode.val) {
                return false;
            }
            queue1.add(pnode.left);
            queue1.add(pnode.right);
            queue2.add(qnode.left);
            queue2.add(qnode.right);
        }
        return true;
    }
}
