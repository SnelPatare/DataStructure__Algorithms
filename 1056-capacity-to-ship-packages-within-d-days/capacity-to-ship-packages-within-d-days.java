class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxweight = 0;
        int totalweight = 0;

        for(int w:weights){
            maxweight = Math.max(maxweight,w);
            totalweight += w;
        }
        int l = maxweight;
        int r = totalweight;
        
        while(l<r){
            int cur =0;
            int day =1;
            int mid = (l+r)/2;
            for(int w:weights){
                if(cur+w > mid){
                    day++;
                    cur =0;
                }
                cur+=w;
            }
            if(day <= days){
                r = mid;
            }else{
                l = mid+1;
            }

            
        }
        return l;
    }
}