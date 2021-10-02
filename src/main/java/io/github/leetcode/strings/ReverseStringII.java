package io.github.leetcode.strings;

public class ReverseStringII {

    public String reverseStr(String s, int k) {
        int n = s.length();
        String ns = "";

        for (int i = 0; i < n; i = i + 2 * k) {
            int j = i + 2 * k;
            if (i + k > n) {
                ns = ns + reverse(s.substring(i, n));
            } else {
                int end = j < n ? (j) : n;
                ns = ns + reverse(s.substring(i, i + k)) + s.substring(i + k, end);
            }
        }
        return ns;
    }

    public String reverse(String s) {
        int n = s.length();
        String ns = "";

        for (int i = n - 1; i >= 0; i--) {
            ns = ns + s.charAt(i);
        }

        return ns;
    }

}
