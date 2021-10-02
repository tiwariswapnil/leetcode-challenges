package io.github.leetcode.strings;

public class CheckIfWordEqualsSummationOfTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int s1 = 0, s2 = 0, s3 = 0;

        for (int i = 0; i < firstWord.length(); i++) {
            s1 = (firstWord.charAt(i) - 'a') + s1 * 10;
        }

        for (int i = 0; i < secondWord.length(); i++) {
            s2 = (secondWord.charAt(i) - 'a') + s2 * 10;
        }

        for (int i = 0; i < targetWord.length(); i++) {
            s3 = (targetWord.charAt(i) - 'a') + s3 * 10;
        }

        return s1 + s2 == s3;
    }

}
