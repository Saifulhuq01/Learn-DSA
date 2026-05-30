package Strings.reverseWord;

import java.util.Arrays;

public class reverseWordcode {
    public static void main(String[] args) {
        System.out.println(reverseWords(" Hello World   "));
    }
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        // StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = words.length-1;

        while(start<end){
            String temp = words[end];
            words[end] = words[start];
            words[start] = temp;
            start++;
            end --;
        }
        return String.join(" ", words);

        // int start=0;
        // int end=s.length() -1;
        // while (!Character.isLetterOrDigit(s.charAt(start))) {
        //     start++;
        // }
        // while (!Character.isLetterOrDigit(s.charAt(end))) {
        //     end--;
        // }
        // while (start<end) {
        //     int endtemp = s.charAt(end);
        //     int starttemp = s.charAt(start);
        //     int temp= endtemp;
        //     endtemp = starttemp;
        //     starttemp = temp;
        //     start++;
        //     end--;
        // }
        // return s;
    }
}
