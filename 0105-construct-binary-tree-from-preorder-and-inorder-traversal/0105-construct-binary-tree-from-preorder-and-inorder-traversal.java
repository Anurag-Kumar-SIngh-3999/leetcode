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

    public TreeNode tree(int[] preorder , HashMap<Integer,Integer> map , int mstart , int mend ,int pstart ){
        
        if(mstart>mend){
            return null;
        }

        // main root 
        int roots = preorder[pstart];
        int rootidx = map.get(roots);

        TreeNode root = new TreeNode(roots);

        int leftsize = rootidx-mstart;

        // divisions of subtress
        root.left=tree(preorder , map ,mstart , rootidx-1 , pstart+1 );
        root.right=tree(preorder , map ,rootidx+1 , mend,pstart+1+leftsize );

        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap< Integer , Integer > map = new HashMap<>();
        for (int i = 0 ; i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = tree(preorder , map ,0 , preorder.length-1 ,0 );

        return root;
    }
    
}