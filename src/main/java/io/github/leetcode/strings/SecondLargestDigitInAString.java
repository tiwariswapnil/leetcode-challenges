package io.github.leetcode.strings;

public class SecondLargestDigitInAString {

    public int secondHighest(String s) {
        int largest = -1, secondLargest = -1;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = Character.getNumericValue(s.charAt(i));

                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }
        }

        return secondLargest;

    }

}
