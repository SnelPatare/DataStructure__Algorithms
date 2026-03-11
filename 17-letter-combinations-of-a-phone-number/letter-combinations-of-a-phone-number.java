class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();
        if(digits.length() ==0) return res;

        String[] map = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits, 0 , map, new StringBuilder(), res);
        return res;
        
    }

    private void backtrack(String digits, int index , String[] map, StringBuilder cur, List<String> res){
        if(digits.length() == index){
            res.add(cur.toString());
            return;
        }

        String letters = map[digits.charAt(index) -'0'];

        for(char c:letters.toCharArray()){
            cur.append(c);
            backtrack(digits, index+1, map, cur, res);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}

