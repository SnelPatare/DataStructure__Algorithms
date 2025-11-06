package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

public class firstUnique {
    public int Sol(String s){

        //O(n2)
        
        // for(int i=0; i<s.length();i++){
        //     boolean fl = true;
        //     for(int j=0; j<s.length();j++){
        //         if(s.charAt(i) == s.charAt(j) && i != j){
        //             fl = false;
        //             break;
        //         }
        //     }
        //     if(fl){
        //         return i;
        //     }
        // }
        // return -1;

        // O(n) space O(n)
        // Map<Character, Integer> res = new HashMap<>();
        // for (int i =0; i<s.length();i++){
        //     res.put(s.charAt(i),1+res.getOrDefault(s.charAt(i),0));
        // }
        // for (int i =0; i<s.length();i++){
        //     if(res.containsKey(s.charAt(i)) && res.get(s.charAt(i))==1){
        //         return i;
        //     }
        // }
        // return -1;

        //O(n) Space O(26) = O(1);
        int[] count = new int[26];

        for(int i =0; i<s.length();i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;

    }



    public static void main(String[] args){
        String s = "eettccooddee";
        firstUnique obj =new firstUnique();
        int res = obj.Sol(s);
        System.out.println(res);
    }
}


