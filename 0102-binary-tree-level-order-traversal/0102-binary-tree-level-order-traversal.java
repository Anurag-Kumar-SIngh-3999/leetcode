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



    public List<List<Integer>> levelOrder(TreeNode root) {
        
       //list of list to return 
        List<List<Integer>> l = new ArrayList<>();
        //base case 
        if(root == null){
            return l;
        }
        
        //creating queeue to store and add to list 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        
        //going level by level
        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0 ; i < size ; i++ ){
                TreeNode currnode = q.remove();

                level.add(currnode.val);

                if(currnode.left != null ){
                    q.add(currnode.left);
                }
                if(currnode.right != null ){
                    q.add(currnode.right);
                }
                
            }
            l.add(level);
        }
        
        return l ;

    }
}