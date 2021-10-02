package io.github.leetcode.strings;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int[] alpha = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            alpha[(int) s.charAt(i) - (int) 'a']++;
        }

        for (int i = 0; i < n; i++) {
            if (alpha[(int) s.charAt(i) - (int) 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

}
