package io.github.leetcode.strings;

import java.util.List;

public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equalsIgnoreCase("type")) {
            index = 0;
        } else if (ruleKey.equalsIgnoreCase("color")) {
            index = 1;
        } else if (ruleKey.equalsIgnoreCase("name")) {
            index = 2;
        }

        int count = 0;

        for (List<String> list : items) {
            if (list.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
