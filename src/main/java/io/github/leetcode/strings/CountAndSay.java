package io.github.leetcode.strings;

public class CountAndSay {

    public String countAndSay(int n) {
        String[] dp = new String[n];
        dp[0] = "1";

        for (int i = 1; i < n; i++) {
            String s = dp[i - 1];
            StringBuilder s1 = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int count = 1;
                while (j + 1 < s.length() && s.charAt(j + 1) == c) {
                    count++;
                    j++;
                }
                s1.append(count).append(Character.getNumericValue(c));
            }

            dp[i] = s1.toString();
        }

        return dp[n - 1];
    }

}
