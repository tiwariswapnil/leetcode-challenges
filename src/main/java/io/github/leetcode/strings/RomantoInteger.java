package io.github.leetcode.strings;

import java.util.HashMap;

public class RomantoInteger {

    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int n = s.length();

        int sum = hm.get(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) >= hm.get(s.charAt(i + 1))) {
                sum += hm.get(s.charAt(i));
            } else {
                sum -= hm.get(s.charAt(i));
            }
        }

        return sum;
    }

}
