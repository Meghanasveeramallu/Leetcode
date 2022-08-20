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
    public List<Integer> preorderTraversal(TreeNode root) {
        al = new ArrayList<Integer>();
        preOrder(root);
        return al;
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return ;
        }
        al.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
