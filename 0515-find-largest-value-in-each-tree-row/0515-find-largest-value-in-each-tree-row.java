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

    public static void collect( List<Integer> max  ,  int l , TreeNode root )
    {
        if(root==null){return ;}
        if(max.size()==l){
            max.add(root.val);
        }else{
            max.set(l,Math.max(max.get(l),root.val));
        }

        collect(max,l+1,root.left);
        collect(max,l+1,root.right);
    }


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> max = new ArrayList<>();   
        collect(max,0,root);
        return max;

    }
}