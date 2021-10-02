package io.github.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();

        for (String word : words) {
            if (isPatternMatching(word, pattern)) {
                l.add(word);
            }
        }

        return l;
    }

    public boolean isPatternMatching(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }
}
