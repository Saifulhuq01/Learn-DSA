package Strings.reverseWord.reverseWordOptimalCode;

public class reverseWordOptimalCode {
    public static void main(String[] args) {
        System.out.println(reverseWords(" Hello World   "));
    }
    public static String reverseWords(String s) {
        // just check if the string is null or empty then return empty string
       if (s == null || s.length() == 0) {
            return "";
        }     
        
        int end = s.length()-1;
        StringBuilder sb = new StringBuilder(end);

        while(end >=0){
            // if end is space then just move the end pointer to left and continue
            if(s.charAt(end)== ' '){
                end--;
                continue;
            }
            // if end is not space then we will find the start of the word 
            // and then append the word to the string builder
            int originalRightSideEnd = end;
            // if ens is not space then we will find the start of the word and then append the word to the string builder
            while(end >= 0 && s.charAt(end) != ' '){
                end--;
            }
            // initally we sb.length() is 0 so we will not append space 
            // but after first word is appended we will append space before appending next word
            if(sb.length() > 0){
                sb.append(' ');
            }
            // append the word to the (s = my value , end +1 = my current pointer start pointer , originalRightSideEnd +1 = my current end pointer
            sb.append(s, end + 1, originalRightSideEnd + 1);
        }
        return sb.toString();

    }
}
