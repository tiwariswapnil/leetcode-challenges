package io.github.leetcode.strings;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        int[] chars = new int[26];
        int n = sentence.length();

        if(n < 26){
            return false;
        }

        int count = 0;

        for(int i = 0; i < n; i++){
            chars[sentence.charAt(i) - 'a']++;
            if(chars[sentence.charAt(i) - 'a'] == 1){
                count++;
            }
        }

        return count == 26;
    }

}
