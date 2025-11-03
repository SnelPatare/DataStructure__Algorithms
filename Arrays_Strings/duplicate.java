package Arrays_Strings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public boolean solution(int[] nums){
        //O(n2)
    //     for (int i =0; i<nums.length; i++){
    //         for (int j = i+1; j<nums.length; j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
      //O(nlogn)
//     Arrays.sort(nums);
//     for (int n=1; n<nums.length; n++){
//         if (nums[n] == nums[n-1]) 
//             return true;
//     }
//     return false;
// }

    // O(n)
    Set<Integer> numSet = new HashSet<>();
    for (int n :nums){
        if(numSet.contains(n)){
            return true;
        }
        numSet.add(n);
    }
    return false;
    }


    public static void main (String[] args){
        int[] arr = {1,2,3,1};
        duplicate dup = new duplicate();

        boolean result = dup.solution(arr);
        System.out.println(result);
    }
}
