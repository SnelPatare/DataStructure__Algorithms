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
    private int currheight = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0;
        dfs(root);
        return currheight;

        
    }
    public int dfs(TreeNode root){
        if(root == null) return -1;
        int leftside = dfs(root.left);
        int rightside = dfs(root.right);

        currheight = Math.max(currheight, leftside+rightside+2);
        return Math.max(leftside, rightside)+1;
    }
}