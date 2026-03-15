class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        backtrack(s,res,cur, 0);
        return res; 
    }

    private void backtrack(String s, List<List<String>> res, List<String> cur, int start){
        if(start == s.length()){
            res.add(new ArrayList(cur));
            return;
        }

        for(int i = start; i<s.length(); i++){
            if(isPalindrom(s, start, i)){
                cur.add(s.substring(start,i+1));
                backtrack(s,res,cur,i+1);
                cur.remove(cur.size()-1);
            }
        }
    }
    private boolean isPalindrom(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true; 
    }
}