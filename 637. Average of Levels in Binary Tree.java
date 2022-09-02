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
    List<Double> ansList= new ArrayList<>();
    public void bfs(TreeNode root){
        if(root==null) 
            return;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        double level=0;
        while(!que.isEmpty()){
            int size = que.size();
            double sum =0;
            level++;
            for(int i=0;i<size;i++){
                TreeNode temp= que.poll();
                sum+= temp.val;
                if(temp.left!=null){
                    que.add(temp.left);
                }
                if(temp.right!=null){
                    que.add(temp.right);
                }
            }
            sum/=size;
            ansList.add(sum);
        } 
    }
    public List<Double> averageOfLevels(TreeNode root) {  
        bfs(root);
        return ansList;
    }
}
