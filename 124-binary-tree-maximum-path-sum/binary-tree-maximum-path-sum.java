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
    private int curMax;
    public int maxPathSum(TreeNode root) {
        curMax = Integer.MIN_VALUE;
        dfs(root);
        return curMax;
    }

    private int dfs(TreeNode node){
        if(node==null) return 0;

        int leftGain = Math.max(dfs(node.left),0);
        int rightGain = Math.max(dfs(node.right),0);

        int curPath = node.val + leftGain + rightGain;

        curMax =  Math.max(curMax , curPath);

        return node.val + Math.max(leftGain , rightGain);

    }
}