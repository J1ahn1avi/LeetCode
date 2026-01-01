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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int res=0;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.right!=null){
                queue.add(node.right);
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            res=node.val;
        }
        return res;
    }
}
