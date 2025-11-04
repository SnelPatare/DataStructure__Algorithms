package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
          return false;
  
        Map<Character, Integer> counter = new HashMap<>();
        Map<Character, Integer> counter1 = new HashMap<>();

        for(int i =0; i <s.length();i++){
            counter.put(s.charAt(i), 1+counter.getOrDefault(s.charAt(i),0));
            counter1.put(t.charAt(i), 1+counter1.getOrDefault(t.charAt(i),0));
        }
        return counter.equals(counter1);
        
        
        
    }

    public static void main(String[] args){
        String str1 = "ana";
        String str2 = "naaa";
        isAnagram ab = new isAnagram();

        System.out.println(ab.isAnagram1(str1, str2));

    }
}