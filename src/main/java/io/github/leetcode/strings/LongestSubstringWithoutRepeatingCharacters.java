package io.github.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        int lengthOfSubString = 0;

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            lengthOfSubString = Math.max(lengthOfSubString, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return lengthOfSubString;
    }

}
