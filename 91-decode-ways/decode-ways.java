class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if(s.charAt(0) == '0'){
            return 0;
        }

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i =2; i <=n ; i++){
            int onedig = s.charAt(i-1)-'0';
            if(onedig >= 1 && onedig <=9){
                dp[i]+=dp[i-1];
            }
            int twodigit = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
            if(twodigit >=10 && twodigit <=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
        
    }
}