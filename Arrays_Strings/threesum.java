package Arrays_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
     public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i =0; i <nums.length-1; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            int target = 0;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if (sum < target){
                    l++;
                }else if(sum > target){
                    r--;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
                }
            }
            return res;
        }


        public static void main (String[] args){
        int[] arr = {-1,-1,-0,1,2,4};
        threesum dup = new threesum();
        List<List<Integer>> res = dup.threeSum(arr);
        System.out.println(res);

    }




    
}
