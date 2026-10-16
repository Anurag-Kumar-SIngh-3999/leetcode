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
    public void rightView(TreeNode root , int l , List<Integer> result){
        if(root == null){
            return ;
        }
        if(result.size()==l){
            result.add(root.val);
        }

        rightView(root.right,l+1,result);
        rightView(root.left,l+1,result);

    }
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> result = new ArrayList<>();
        rightView(root,0,result);
        return result;
    }
}