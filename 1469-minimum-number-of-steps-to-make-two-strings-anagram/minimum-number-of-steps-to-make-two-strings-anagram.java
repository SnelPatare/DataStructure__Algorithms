class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        
        for(int i=0; i < s.length(); i++){
            char c=s.charAt(i);
            freq.put(c, freq.getOrDefault(c,0)+1);
            
        }
        for(int i=0; i < t.length(); i++){
            char c=t.charAt(i);
            freq.put(c, freq.getOrDefault(c,0)-1);
        }
        int steps = 0;
        for(int val:freq.values()){
            if(val >0){
                steps+=val;
            }
        }
        return steps;
        
    }
}