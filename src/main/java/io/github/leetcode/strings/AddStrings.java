package io.github.leetcode.strings;

public class AddStrings {

    public String addStrings(String num1, String num2) {

        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while (len1 >= 0 || len2 >= 0) {
            int digit1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int digit2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            len1--;
            len2--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

}
