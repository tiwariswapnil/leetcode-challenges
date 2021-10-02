package io.github.leetcode.strings;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = magazine.length();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(magazine.charAt(i))) {
                hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1);
            } else {
                hm.put(magazine.charAt(i), 1);
            }
        }

        int n1 = ransomNote.length();

        for (int j = 0; j < n1; j++) {
            char c = ransomNote.charAt(j);
            if (hm.containsKey(c) && hm.get(c) > 0) {
                hm.put(c, hm.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

}
