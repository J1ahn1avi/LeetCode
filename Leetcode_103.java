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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return res;
        }
        boolean flag=false;
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> arr=new ArrayList<>();
            Stack<Integer>stack=new Stack<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(flag){
                    stack.add(node.val);
                }else{
                    arr.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            flag=!flag;
            while(!stack.isEmpty()){
                arr.add(stack.pop());
            }
            res.add(arr);
        }
        return res;
    }
}
