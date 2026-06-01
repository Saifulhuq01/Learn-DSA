package Strings.stringCompression.stringCompressionOptimal;

public class stringCompressionOptimalCode {
    public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int start = 0;
        int end =  chars.length;
        int index = 0;
        while (start < end) {
            char currentChar = chars[start];
            int count = 0;
            while (start < end && chars[start] == currentChar) {
                count++;
                start++;
            }
            chars[index++] = currentChar;
            if(count >1){
                // count convert to string
                String countStr = Integer.toString(count);
                for (int j = 0; j < countStr.length(); j++) {
                    //already index increased by 1 from current char, so we can directly use index to add countStr like a + 2 = a2
                    chars[index++] = countStr.charAt(j);
                }
            }
        }
        return index;
    }
}
