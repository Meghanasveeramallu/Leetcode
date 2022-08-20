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
    List output = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return output;
        inorderTraversal(root.left);
        output.add(root.val);
        inorderTraversal(root.right);

        return output;
    }   
}
