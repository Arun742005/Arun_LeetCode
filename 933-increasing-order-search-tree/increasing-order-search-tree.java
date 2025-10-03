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
    TreeNode newRoot = new TreeNode(0); // Dummy node
    TreeNode prev = newRoot;
    
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return newRoot.right; // Skip dummy
    }
    
    private void inorder(TreeNode node) {
        if (node == null) return;
        
        inorder(node.left);      // Left
        node.left = null;        // Remove left child
        prev.right = node;       // Attach node to right of prev
        prev = node;             // Move prev
        inorder(node.right);     // Right
    }
}
