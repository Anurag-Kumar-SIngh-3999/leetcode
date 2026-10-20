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
    static int max ;
    public int helper(TreeNode root  ){
        // base case 
        if(root == null ){
            return 0 ;
        }
        // visitng every node
        int left = helper(root.left  );
        int right = helper(root.right );
        
        // update the answer
        max = Math.max(max,root.val + Math.max(0,left) + Math.max(0,right));
        // return amx value
        return root.val + Math.max(Math.max(0,left),Math.max(0,right));
    }
    public int maxPathSum(TreeNode root) {
        max = root.val;
        int value = helper(root);
        return max;
    }
}