class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        dp[0] =1;
        int ans = dp[0];

        for(int i =1; i < nums.length; i++){
            for(int j =0; j<i; j++){    
            if (nums[j] < nums[i]){
                dp[i] = Math.max(dp[i], dp[j]+1);
                
            }
            }
            
            ans = Math.max(ans, dp[i]);
            
        }
        System.out.println(Arrays.toString(dp));
        return ans;
    }
}