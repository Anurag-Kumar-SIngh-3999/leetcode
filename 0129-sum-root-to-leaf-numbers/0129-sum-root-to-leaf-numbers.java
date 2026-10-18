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

    public int helper(TreeNode root , int totalSum , int psum ){
        if(root == null ){
            return  totalSum;
        }
        if( root.right == null && root.left == null ){
            psum = psum * 10 + root.val;
            totalSum += psum ;
            psum = 0;
            return totalSum ;
            }
        
        psum = psum * 10 + root.val; 
        int left = helper(root.left , totalSum , psum);
        int right = helper(root.right , totalSum , psum);
        return left + right ;
    }

    public int sumNumbers(TreeNode root) {
        int totalSum = helper( root , 0 , 0 );
        return totalSum ;
    }
}