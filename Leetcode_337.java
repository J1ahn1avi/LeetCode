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
    public int rob(TreeNode root) {
        int options[]=new int[2];
        options=travel(root);
        return Math.max(options[0],options[1]);
    }

    public int[] travel(TreeNode node){
        if(node == null) return new int[2];
        int options[]=new int[2];
        int[] left=travel(node.left);
        int right[]=travel(node.right);
        options[0]=node.val+left[1]+right[1];
        options[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return options;
    }
}
