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
    public void dataCollector(List<List<Integer>> result , TreeNode root , int targetSum , List<Integer> path){
        if(root == null ) return ;

        targetSum -= root.val;
        path.add(root.val);

        if(root.right == null && root.left == null && targetSum==0){
            result.add(new ArrayList<>(path));
        }

        dataCollector(result, root.left,targetSum,path);
        dataCollector(result, root.right,targetSum,path);

        path.remove(path.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dataCollector(result , root , targetSum,path);
        return result;
    }
}