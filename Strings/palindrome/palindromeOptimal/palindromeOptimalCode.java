package Strings.palindrome.palindromeOptimal;

public class palindromeOptimalCode {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        int start=0;
        int end= s.length()-1;

        if(s == null){
            return false;//important step
        }
        
        while (start < end) {
            // start < end && this will help to control a out of bound
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++; // for if start contain diff chracter instead of alpha numeric
            }
            while( start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;// for if end contain diff chracter instead of alpha numeric
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            //shrink
            start++;
            end--;
        }
        return true;
    }

}
