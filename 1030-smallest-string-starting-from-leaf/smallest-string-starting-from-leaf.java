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
     String result = "";
    public String smallestFromLeaf(TreeNode root) {
        if(root!=null){
            dfs(root, "");
            return result;
        }
        return result;
    }
    
    void dfs(TreeNode root, String stringcur){
        stringcur = (char) (root.val+'a')+stringcur;
        if(root.left == null && root.right == null){
            if(result.isEmpty() || result.compareTo(stringcur) > 0){
                result = stringcur;
            }
        }
        if(root.left!=null){
            dfs(root.left, stringcur);
        }
        if(root.right!=null){
            dfs(root.right, stringcur);
        }
        
    }
}