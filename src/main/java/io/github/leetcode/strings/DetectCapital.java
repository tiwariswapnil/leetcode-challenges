package io.github.leetcode.strings;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int lower = 0;
        int upper = 0;

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);

            if (c <= 'z' && c >= 'a') {
                lower++;
            } else if (c <= 'Z' && c >= 'A') {
                upper++;
            }
        }

        if (upper == n || lower == n) {
            return true;
        } else if (upper == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        } else {
            return false;
        }
    }

}
