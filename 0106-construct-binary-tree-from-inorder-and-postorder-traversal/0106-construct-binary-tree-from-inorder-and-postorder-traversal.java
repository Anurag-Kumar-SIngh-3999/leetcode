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

    public TreeNode Tree(Map<Integer , Integer> map , int[] postorder , int poststart , int instart , int inend ){
        if( instart>inend ){
            return null;
        }
        int roots = postorder[poststart];
        int rootidx = map.get(roots);

        TreeNode root = new TreeNode(roots);

        //division
        int rightsize=inend-rootidx;
        root.right=Tree( map , postorder , poststart-1 , rootidx+1 , inend );
        root.left=Tree( map , postorder , poststart-rightsize-1 , instart , rootidx-1 );
        
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i],i);
        }
        int poststart=postorder.length-1;
        int instart = 0;
        int inend=postorder.length-1;
        TreeNode root = Tree( map , postorder , poststart , instart , inend );

        return root ;


    }
}