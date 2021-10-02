package io.github.leetcode.strings;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        StringBuffer sb = new StringBuffer(s);

        int end = s.length() - 1;
        int start = 0;

        while (start < end) {

            while (start < end && !Character.isAlphabetic(sb.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isAlphabetic(sb.charAt(end))) {
                end--;
            }

            if (start < end) {
                char c = s.charAt(start);
                sb.setCharAt(start, s.charAt(end));
                sb.setCharAt(end, c);
            }
            start++;
            end--;
        }

        return sb.toString();
    }

}
