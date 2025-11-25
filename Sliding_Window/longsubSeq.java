package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class longsubSeq {

    public int longSeq(String s){
        int l = 0;
        int res = 0;
        Set<Character> dup = new HashSet<>();
        for (int r=0; r<s.length(); r++){
            char c= s.charAt(r);
            if(dup.contains(c)){
                dup.remove(s.charAt(l));
                l++;
            }
            dup.add(c);
            res = Math.max(res, r-l+1);
        }
        return res;

    }

    public static void main(String[] args){
        String s = "abcabcbb";
        longsubSeq obj = new longsubSeq();
        int res = obj.longSeq(s);
        System.out.println(res);
    }
    
}
