package io.github.leetcode.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;

    }

}
