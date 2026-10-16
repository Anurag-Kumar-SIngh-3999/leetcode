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
    public void helper(TreeNode root , int l , List<List<Integer>> result ){
        if(root==null){
            return ;
        }

        if(result.size()==l){
            List<Integer> curr = new ArrayList<>();
            curr.add(root.val);
            result.add(curr);
        }
        else{
            result.get(l).add(root.val);
        }
    
        helper(root.left , l+1 , result);
        helper(root.right , l+1 , result);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root , 0 , result);
        for(int i=0;i<result.size();i++){
            if(i%2!=0){
                Collections.reverse(result.get(i));
            }
        }
        return result;
    }
}