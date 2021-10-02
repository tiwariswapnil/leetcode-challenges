package io.github.leetcode.strings;

public class SplitAStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int n = s.length();
        int count = 0;
        int countL = 0;
        int countR = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'L') countL++;
            if (s.charAt(i) == 'R') countR++;

            if (countL == countR) {
                count++;
            }

        }

        return count;

    }

}
