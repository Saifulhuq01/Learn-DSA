package Strings.stringCompression;

public class stringCompressionCode {
    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int start = 0;
        int end = chars.length;
        
        StringBuilder sb = new StringBuilder(end);
       
        while (start < end) {
            char currentChar = chars[start];
            int count = 0;
            while (start <end && chars[start] == currentChar ) {
                count++;
                start++;
            }
            sb.append(currentChar);

            if (count > 1) {
                sb.append(count);
            }
            for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        }
        return sb.length();
    }
}
