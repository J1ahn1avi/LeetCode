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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tnode = queue.remove();
                arr.add(tnode.val);
                if (tnode.left != null)
                    queue.add(tnode.left);
                if (tnode.right != null)
                    queue.add(tnode.right);
            }
            res.add(arr);
        }
        return res;

    }
}
