class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,cur, 0, nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> cur, int index, int[] nums){
        res.add(new ArrayList(cur));

        for(int i =index; i<nums.length; i++){
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }

            cur.add(nums[i]);
            backtrack(res, cur, i+1, nums);
            cur.remove(cur.size()-1);
        }
    }
}