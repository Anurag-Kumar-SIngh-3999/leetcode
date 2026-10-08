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
    class TreeInfo{
        int ht ;
        int diam;

        TreeInfo(int ht , int diam){
            this.ht=ht;
            this.diam = diam;
        }
    }
    public TreeInfo findiam(TreeNode root ){
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left =findiam(root.left);
        TreeInfo right = findiam(root.right);
        int maxht = Math.max(left.ht,right.ht)+1;
        
        int ldiam = left.diam;
        int rdiam = right.diam;
        int diam = left.ht+right.ht;

        int maxdiam = Math.max(diam,Math.max(ldiam,rdiam));
 
        return new TreeInfo(maxht,maxdiam);
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        TreeInfo newpath=findiam(root);
        return newpath.diam;

    }
}