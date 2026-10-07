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
    public StringBuilder convert(List<Integer> str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<str.size();i++){
            sb.append(str.get(i));
            if(i!=str.size()-1){
                sb.append("->");
            }
        }
        return sb;
    }
    public void dfs(TreeNode root , List<Integer> str, List<String> result){  
        if(root == null){
            return ;
        }
        str.add(root.val);
        if(root.left==null && root.right==null){
            StringBuilder str1=convert(str);
            result.add(""+str1);
            str.remove(str.size()-1);
            return ;
        }
                
        dfs(root.left,str,result);
        dfs(root.right,str,result);
        str.remove(str.size()-1);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> str = new ArrayList<>();
        dfs(root,str,result);
        return result;
    }
}