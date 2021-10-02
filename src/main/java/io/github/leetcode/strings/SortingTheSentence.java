package io.github.leetcode.strings;

public class SortingTheSentence {

    public String sortSentence(String s) {
        String ns = "";
        String[] arr1 = s.split(" ");
        int n = arr1.length;
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            String temp = arr1[i];
            int indexOfTemp = Integer.parseInt(temp.substring(temp.length() - 1));
            arr2[indexOfTemp - 1] = temp.substring(0, temp.length() - 1);
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ns = arr2[i];
            } else {
                ns = ns + " " + arr2[i];
            }
        }

        return ns;
    }

}
