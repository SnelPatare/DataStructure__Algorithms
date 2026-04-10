class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int degree = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i =0; i<nums.length; i++){
            first.putIfAbsent(nums[i],i);
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
            degree = Math.max(degree, count.get(nums[i]));
        }

        for(int num: count.keySet()){
            if(count.get(num) == degree){
                int length = lastIndex(nums,num) - first.get(num) +1;
                minLen = Math.min(minLen, length);
            }

        }
        return minLen;        
    }

    private int lastIndex(int[] nums, int num){
        for(int i = nums.length-1; i >=0 ; i--){
            if(nums[i] == num){
                return i;
            }
        }
        return -1;
    }
}