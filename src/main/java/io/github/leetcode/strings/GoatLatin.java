package io.github.leetcode.strings;

import java.util.StringTokenizer;

public class GoatLatin {

    public String toGoatLatin(String sentence) {
        StringTokenizer sentenceTokens = new StringTokenizer(sentence);
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (sentenceTokens.hasMoreTokens()) {
            String word = sentenceTokens.nextToken();
            if (word.length() > 1 && !isVowel(word.charAt(0))) {
                sb.append(word.substring(1)).append(word.charAt(0));
            } else {
                sb.append(word);
            }

            sb.append("ma");
            sb.append("a".repeat(Math.max(0, i)));
            i++;

            if (sentenceTokens.hasMoreTokens()) sb.append(" ");
        }

        return sb.toString();
    }

    public boolean isVowel(Character c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
