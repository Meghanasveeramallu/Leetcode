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
    int ans;
    
    private int pred(TreeNode root){
        if(root.right == null)            
            return root.val;
        return pred(root.right);
    }
    
    private int succ(TreeNode root){
        if(root.left == null)
            return root.val;
        return succ(root.left);
    }
    
    private void solution(TreeNode root){
        if(root == null)
            return;
        
        int pre = root.left == null ? root.val : pred(root.left);
        int suc = root.right == null ? root.val : succ(root.right);
        
        pre = root.val - pre;
        if(pre != 0) ans = Math.min(pre, ans);
        suc = suc - root.val;
        if(suc != 0) ans = Math.min(suc, ans);
        
        solution(root.left);
        solution(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
        this.ans = Integer.MAX_VALUE;
        solution(root);
        return ans;
        
    }
}
