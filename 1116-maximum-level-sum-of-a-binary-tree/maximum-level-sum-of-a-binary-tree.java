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
    public int maxLevelSum(TreeNode root) {
        int result = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        int largest =Integer.MIN_VALUE;
        int level = 1;

        while(!q.isEmpty()){
            int sum = 0;
            int sizeq = q.size();
            

            for (int i =0; i < sizeq; i++){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if ( sum > largest) {
                largest = sum;
                result = level;
            }
            level++;
        }
        return result;
    }
}