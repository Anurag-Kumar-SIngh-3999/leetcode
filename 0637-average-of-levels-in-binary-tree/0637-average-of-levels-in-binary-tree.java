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
    public void helper(TreeNode root , int l , List<Double> count , List<Double> avg){
        if(root==null){
            return ;
        }

        if(count.size()==l){
            count.add(1.0);
            double curr = root.val;
            avg.add(curr);
        }
        else{
            count.set(l,count.get(l)+1);
            avg.set(l,avg.get(l)+root.val);
        }
    
        helper(root.left , l+1 , count , avg);
        helper(root.right , l+1 , count , avg);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> count = new ArrayList<>(); 
        List<Double> avg = new ArrayList<>();   
        helper(root , 0 , count ,avg);
        for(int i=0; i<avg.size();i++){
            avg.set(i,avg.get(i)/count.get(i));
        }

        return avg;
    }
}