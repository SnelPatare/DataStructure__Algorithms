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
    private List<List<Integer>> result;
    public List<List<Integer>> findLeaves(TreeNode root) {
        this.result = new ArrayList<>();
        dfs(root);
        return this.result;

    }
    private int dfs(TreeNode root){
        if(root == null) return -1;
        int leftside = dfs(root.left);
        int rightside = dfs(root.right);

        int currheight = Math.max(leftside, rightside)+1;
        if(this.result.size() == currheight){
            this.result.add(new ArrayList<>());
        }
        this.result.get(currheight).add(root.val);
        return currheight;
    }


}