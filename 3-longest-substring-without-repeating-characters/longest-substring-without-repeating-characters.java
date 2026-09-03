class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        Set<Character> set = new HashSet<>(); 
        int n = s.length();
        int count =0;

        for(int r=0; r<n; r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
 
                l++;
            }
            count = Math.max(count, r-l+1);
            set.add(s.charAt(r));
            
        }
        return count;
        
    }
}