class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l =0;
        int r = 0;
        for(int w:weights){
            l = Math.max(l,w);
            r +=w;
        }

        while(l<r){
            int cur =0;
            int day =1;
            int mid = (l+r)/2;
            for(int w:weights){
                if(cur+w > mid){
                    cur = 0;
                    day += 1;
                }
                cur += w;
            }
            if(day<=days){
               r = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}