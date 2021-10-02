package io.github.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;

        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }

        while (first != null) {
            second = second.next;
            first = first.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

}
