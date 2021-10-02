package io.github.leetcode.strings;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2, n);

        int c1 = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = s1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                c1++;
            }
        }

        int c2 = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = s2.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                c2++;
            }
        }

        return c1 == c2;
    }
}
