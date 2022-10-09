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
    TreeNode root = null;
    
    public boolean findTarget(TreeNode root, int target) {
        this.root = root;
        return find(root, target);
    }
    
    boolean find(TreeNode node, int target) {
        if (node == null) return false;
        if (hasRequiredVal(root, target-node.val, node.val)) 
            return true;
        return find(node.left, target) || find(node.right, target);
    }
    
    boolean hasRequiredVal(TreeNode node, int val, int firstVal) {
        if (node == null) return false;
        if (node.val == val && node.val != firstVal)
            return true;
        else if (val < node.val)
            return hasRequiredVal(node.left, val, firstVal);
        else
            return hasRequiredVal(node.right, val, firstVal);
    }
}
