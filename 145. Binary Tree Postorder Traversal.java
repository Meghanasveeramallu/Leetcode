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
    ArrayList<Integer> al;
    public List<Integer> postorderTraversal(TreeNode root) {
        al = new ArrayList<Integer>();
        postOrder(root);
        return al;
    }
    public void postOrder(TreeNode root){
        if(root == null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        al.add(root.val);
    }
}
