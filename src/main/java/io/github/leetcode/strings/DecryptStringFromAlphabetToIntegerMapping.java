package io.github.leetcode.strings;

public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {
        int n = s.length();
        String ns = "";

        for (int i = 0; i < n; i++) {
            int c = Character.getNumericValue(s.charAt(i));

            if (i + 2 < n && s.charAt(i + 2) == '#') {
                int c1 = Character.getNumericValue(s.charAt(i + 1));
                ns = ns + (char) ('j' + c * 10 + c1 - 10);
                i = i + 2;
            } else {
                ns = ns + (char) ('a' + c - 1);
            }

        }
        return ns;
    }

}
