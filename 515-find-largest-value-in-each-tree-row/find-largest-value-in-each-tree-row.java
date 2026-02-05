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
    public List<Integer> largestValues(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                TreeNode largestValue = null;
                int size = q.size();

                for(int i =0; i < size ; i++){
                    TreeNode node = q.poll();
                    if (largestValue != null){
                        if( largestValue.val < node.val) largestValue = node;
                    }else{
                        largestValue = node;
                    }
                    if (node.left!= null) q.add(node.left);
                    if (node.right!= null) q.add(node.right);
                }
                result.add(largestValue.val);
                
            }
        return result;
    }
}