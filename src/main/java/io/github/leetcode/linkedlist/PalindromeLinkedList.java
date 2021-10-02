package io.github.leetcode.linkedlist;

public class PalindromeLinkedList {

    ListNode temp;
    public boolean isPalindrome(ListNode head) {
        temp = head;
        return check(temp);
    }

    public boolean check(ListNode head) {
        if(head == null) return true;
        boolean isPal = check(head.next) && (temp.val == head.val);
        temp = temp.next;
        return isPal;
    }

}
