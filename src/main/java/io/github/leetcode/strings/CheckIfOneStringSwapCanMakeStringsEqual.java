package io.github.leetcode.strings;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();
        int diff = 0;
        char c1 = '.', c2 = '.';
        char d1 = '.', d2 = '.';

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
                if (diff == 1) {
                    c1 = s1.charAt(i);
                    c2 = s2.charAt(i);
                } else if (diff == 2) {
                    d1 = s1.charAt(i);
                    d2 = s2.charAt(i);
                } else {
                    return false;
                }
            }
        }

        return (c1 == d2) && (c2 == d1);
    }

}
