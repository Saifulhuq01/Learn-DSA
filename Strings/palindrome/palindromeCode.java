package Strings.palindrome;

public class palindromeCode {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        String val = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < val.length()/2; i++) {
            if (val.charAt(i) != val.charAt(val.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
