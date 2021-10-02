package io.github.leetcode.strings;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;

        if(n == 0){
            return 0;
        }

        return arr[n-1].length();
    }

}
