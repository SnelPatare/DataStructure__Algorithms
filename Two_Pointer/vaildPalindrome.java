package Two_Pointer;

public class vaildPalindrome {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0; 
        int end = s.length()-1;
        while (start <= end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start ++;
            end --;

        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        vaildPalindrome obj = new vaildPalindrome();
        boolean res = obj.isPalindrome(s);
        System.out.println(res);
    }
}
    
