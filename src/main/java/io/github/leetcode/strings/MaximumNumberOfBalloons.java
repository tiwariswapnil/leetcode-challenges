package io.github.leetcode.strings;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        int[] chars = new int[26];

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            chars[c - 97]++;
        }

        int count = 0;
        String balloon = "balloon";
        boolean flag = true;

        while (flag) {

            for (int i = 0; i < 7; i++) {
                char c = balloon.charAt(i);
                chars[c - 97]--;
                if (chars[c - 97] < 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) count++;
        }

        return count;
    }

}
