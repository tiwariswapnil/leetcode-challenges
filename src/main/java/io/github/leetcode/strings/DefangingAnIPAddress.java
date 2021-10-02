package io.github.leetcode.strings;

public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
