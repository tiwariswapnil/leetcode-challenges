package io.github.leetcode.strings;

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        if(name.equals(typed)){
            return true;
        }

        if(typed.length() < name.length()){
            return false;
        }

        int i = 0, j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }

}
