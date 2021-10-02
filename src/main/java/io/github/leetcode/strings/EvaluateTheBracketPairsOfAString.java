package io.github.leetcode.strings;

import java.util.HashMap;
import java.util.List;

public class EvaluateTheBracketPairsOfAString {

    public String evaluate(String s, List<List<String>> knowledge) {
        int n = knowledge.size();
        HashMap<String, String> hm = new HashMap<>();

        for (List<String> strings : knowledge) {
            hm.put(strings.get(0), strings.get(1));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ) {

            if (s.charAt(i) == '(') {

                int index = s.indexOf(')', i);
                String key = s.substring(i + 1, index);

                sb.append(hm.getOrDefault(key, "?"));
                i = index + 1;

            } else {
                sb.append(s.charAt(i));
                i++;
            }

        }

        return sb.toString();
    }

}
