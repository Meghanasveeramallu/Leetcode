/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = (p.val > q.val)? p.val : q.val;
        int min = (p.val < q.val)? p.val : q.val;
        if (root.val > max) {
            return lowestCommonAncestor(root.left, p, q);
        }
        else if (root.val < min) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else 
            return root;
    }
}
