package Arrays_Strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;

public class grpAnagram {
    public List<List<String>> sol(String[] strs){

        //O(n2)
        // Map<String, List<String>> res = new HashMap<>();

        // for(String s:strs){
        //     char[] c = s.toCharArray();
        //     Arrays.sort(c);
        //     String key = new String(c);
        //     res.putIfAbsent(key, new ArrayList<>());
        //     res.get(key).add(s);
        // }

        // return new ArrayList<>(res.values());

        //O(n)
        Map<String, List<String>> res = new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());

    }

    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        grpAnagram obj = new grpAnagram();
        List<List<String>> res = obj.sol(strs);
        System.out.println(res);


    }
    
}


