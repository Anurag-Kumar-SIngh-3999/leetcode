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

    public static void collect(List<List<Integer>> values , List<Integer> max  ,  int l , TreeNode root )
    {
        if(root==null){return ;}
        if(values.size()==l){
            List<Integer> level = new ArrayList<>();
            level.add(root.val);
            values.add(level);
            max.add(root.val);
        }else{
            values.get(l).add(root.val);
            max.set(l,Math.max(max.get(l),root.val));
        }

        collect(values,max,l+1,root.left);
        collect(values,max,l+1,root.right);
    }


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> max = new ArrayList<>();
        List<List<Integer>> values = new ArrayList<>();
        
        collect(values,max,0,root);
        return max;

    }
}