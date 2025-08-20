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
    int postorderIndex ;
    Map<Integer , Integer>inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

    for(int i=0; i<inorder.length;i++){
        inorderMap.put(inorder[i] , i);
    }

    postorderIndex = postorder.length-1;
    return helper(postorder , 0 , inorder.length-1);     
    }

    private TreeNode helper(int[] postorder , int left , int right){

        if(left > right) return null;

        int rootval = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootval);

        int inorderIndex = inorderMap.get(rootval);

        root.right = helper(postorder , inorderIndex+1 , right);
        root.left = helper(postorder ,left, inorderIndex-1);

        return root;
    }
}