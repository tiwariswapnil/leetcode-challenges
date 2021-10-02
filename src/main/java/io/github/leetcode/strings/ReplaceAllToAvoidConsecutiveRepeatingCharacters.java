package io.github.leetcode.strings;

public class ReplaceAllToAvoidConsecutiveRepeatingCharacters {

    public String modifyString(String s) {
        String ns = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                char c = 'a';
                while ((i + 1 < n && c == s.charAt(i + 1)) || (i - 1 >= 0 && c == ns.charAt(i - 1))) {
                    c = (char) (c + 1);
                }
                ns = ns + c;
            } else {
                ns = ns + s.charAt(i);
            }
        }

        return ns;
    }

}
