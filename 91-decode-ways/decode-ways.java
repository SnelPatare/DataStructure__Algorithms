class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
         if (s.charAt(0) == '0') {
            return 0;
        }
        dp[1]=1;
        dp[0] = 1;

        for(int i =2; i <=n; i++){
            int onedig = (s.charAt(i-1)-'0');
            if(onedig >= 1 && onedig <=9){
                dp[i]+=dp[i-1];
            }
            int twodig = ((s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0'));
            if(twodig >= 10 && twodig <=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];

        
    }
}