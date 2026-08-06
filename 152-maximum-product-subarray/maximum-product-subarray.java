class Solution {
    public int maxProduct(int[] nums) {
        int maxpod = nums[0];
        int minpod = nums[0];
        int ans = nums[0];

        for(int i =1; i <nums.length; i++){
            int curr = nums[i];
            int tempmax = Math.max(curr, Math.max(curr*maxpod, curr*minpod));
            int tempmin = Math.min(curr, Math.min(curr*maxpod, curr*minpod));

            maxpod = tempmax;
            minpod = tempmin;

            ans = Math.max(ans, maxpod);
        }
        return ans;

        
    }
}