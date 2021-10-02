package io.github.leetcode.strings;

public class ConsecutiveCharacters {

    public int maxPower(String s) {
        int n = s.length();
        int power = 1;

        for (int i = 1; i < n; i++) {
            int temp = 1;
            while (i < n && s.charAt(i) == s.charAt(i - 1)) {
                temp++;
                i++;
            }
            power = Math.max(power, temp);
        }

        return power;
    }

}
