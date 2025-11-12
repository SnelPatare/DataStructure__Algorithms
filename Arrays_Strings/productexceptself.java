package Arrays_Strings;

import java.util.Arrays;

public class productexceptself {
     public int[] productExceptSelf(int[] nums) {

        //O(n2) runtime 

        // int[] res = new int[nums.length];
        // for(int i =0; i<nums.length;i++){
        //     int product = 1;
        //     for(int j =0; j<nums.length;j++){
        //         if(i!=j){

        //             product = product *nums[j];
        //         }         
        //     }
        //     res[i]=product;
        // }
        // return res;
        // int product = 1;
        // int countzero=0;
        // for(int i:nums){
        //     if (i!=0){
        //         product *= i;
        //     }
        //     else{
        //         countzero ++;
        //     }
        // }
        // if (countzero > 1) {
        //     return new int[nums.length];
        // }

        // int[] res = new int[nums.length];
        // for(int i =0; i<nums.length; i++){

        //     if(countzero >0){
        //         res[i] = (nums[i] == 0) ? product:0;
        //     }
        //     else{
        //         res[i] = product/nums[i];
        //     }
        // }
        // return res;

        //O(n) runtime O(1) space
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i =1; i< nums.length;i++){
            res[i] = res[i-1]* nums[i-1];
        }

        int postfix =1;
        int n = nums.length; 
        for(int i = n-1; i>=0; i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        productexceptself obj = new productexceptself();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}
