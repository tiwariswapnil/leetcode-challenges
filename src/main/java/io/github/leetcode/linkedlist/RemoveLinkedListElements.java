package io.github.leetcode.linkedlist;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;

        while (dummy.next != null) {
            if (dummy.next.val == val) dummy.next = dummy.next.next;
            else dummy = dummy.next;
        }

        return head.next;
    }

}
