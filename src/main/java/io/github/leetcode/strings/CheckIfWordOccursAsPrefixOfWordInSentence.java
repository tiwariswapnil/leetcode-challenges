package io.github.leetcode.strings;

import java.util.StringTokenizer;

public class CheckIfWordOccursAsPrefixOfWordInSentence {

    public int isPrefixOfWord(String sentence, String searchWord) {

        StringTokenizer sentenceTokens = new StringTokenizer(sentence);
        int i = 1;

        while (sentenceTokens.hasMoreTokens()) {
            String word = sentenceTokens.nextToken();
            if (word.startsWith(searchWord))
                return i;
            i++;
        }

        return -1;

    }

}
