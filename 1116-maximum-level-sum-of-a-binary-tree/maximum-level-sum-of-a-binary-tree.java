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
        List<Integer> level = new ArrayList<>();
        while(!q.isEmpty()){
            int sum = 0;
            int sizeq = q.size();

            for (int i =0; i < sizeq; i++){
                TreeNode node = q.poll();
                sum = sum + node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            level.add(sum);
        }

        int size = level.size();
        int largest = level.get(0);
        result = 1;
        for(int j = 1; j<size; j++){
            if (level.get(j) > largest) {
                largest = level.get(j);
                result = j+1;
            }

        }
        return result;
    }
}