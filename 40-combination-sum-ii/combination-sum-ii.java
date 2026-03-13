class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, cur, 0, target, candidates);
        return res;
        
    }
    private void backtrack(List<List<Integer>> res,List<Integer> cur, int index, int target, int[] nums){
        if(target == 0){
            res.add(new ArrayList(cur));
            return;
        }

        for(int i =index; i <nums.length; i++){
            if(nums[i] > target) return;
            if(i > index && nums[i] == nums[i-1] ) continue;
            cur.add(nums[i]);
            backtrack(res, cur, i+1, target-nums[i], nums);
            cur.remove(cur.size()-1);
        }
    }
}