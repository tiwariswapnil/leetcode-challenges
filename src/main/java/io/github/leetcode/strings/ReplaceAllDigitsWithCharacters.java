package io.github.leetcode.strings;

public class ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                char c = (char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i)));
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
