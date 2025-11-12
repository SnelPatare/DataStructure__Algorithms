package Arrays_Strings;

import java.util.HashSet;
import java.util.Set;

public class longConscetiveSequence {
    public int longestConsecutive(int[] nums) {
        // int res = 0;
        // Set<Integer> dup = new HashSet<>();
        // for (int n:nums){
        //     dup.add(n);
        // }
        
        // for(int i = 0; i<nums.length; i++){
        //     int st = 0 ,curr = nums[i];
        //     while(dup.contains(curr)){
        //         curr ++;
        //         st ++;
        //     }
        //     res = Math.max(res, st);

        //     }
        // return res;


        // O(nlogn)
        // if(nums.length == 0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int res = 1, count =1;
        // for(int i =1; i < nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         continue;
        //     }else if(nums[i] == nums[i-1]+1){
        //         count++;
        //     }else{
        //         count = 1;
        //     }
        //     res = Math.max(res,count);
        // }
        // return res;
        

        int res = 0;
        Set<Integer> dup = new HashSet<>();
        for(int n:nums){
            dup.add(n);
        }

        for(int i=0; i<nums.length;i++){
            if(!dup.contains(nums[i]-1)){
                int count =1;
                int curr = nums[i];
                while(dup.contains(curr+1)){
                    count ++;
                    curr ++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        longConscetiveSequence obj = new longConscetiveSequence();
        int[] nums = {1,1,2,3,6,9};
        int res = obj.longestConsecutive(nums);
        System.out.println(res);


    }
        
    }

    

