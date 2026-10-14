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
    public int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = check(root.left);
        int rh = check(root.right);
        return Math.max(lh,rh)+1;
    }


    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
       
          
        if (isBalanced(root.left) && isBalanced(root.right)){
            if (Math.abs(check(root.left)-check(root.right))<=1){
                return true;
            }else{
                return false;
                }
        }else{
            return false;
        }
        
        
    }
}