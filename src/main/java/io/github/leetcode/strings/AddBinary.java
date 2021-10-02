package io.github.leetcode.strings;

public class AddBinary {

    public String addBinary(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0, sum = 0;

        while (len1 >= 0 || len2 >= 0) {
            int digit1 = len1 >= 0 ? a.charAt(len1) - '0' : 0;
            int digit2 = len2 >= 0 ? b.charAt(len2) - '0' : 0;
            sb.append(digit1 ^ digit2 ^ carry);
            carry = (digit1 & digit2) | (digit1 & carry) | (digit2 & carry);

            len1--;
            len2--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();

    }

}
