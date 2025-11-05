package Arrays_Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class twoSum {
    public int[] Solution(int[] nums, int target){

        //O(n2)
        // for (int i =0; i< nums.length; i++){
        //     for (int j=i+1; j<nums.length; j++){
                
        //         if (nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};

        //O(n)
        Map<Integer, Integer> count=new HashMap<>();
        for (int i =0; i< nums.length;i++){
            int diff = target-nums[i];
            if (count.containsKey(diff)){
                return new int[]{i, count.get(diff)};
            }
            count.put(nums[i],i);
        }
        return new int[]{};


    }
    
    public static void main(String[] args){
        int[] nums = {7,5,3,4};
        int target = 9;

        twoSum onj = new twoSum();
        int[] res= onj.Solution(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
