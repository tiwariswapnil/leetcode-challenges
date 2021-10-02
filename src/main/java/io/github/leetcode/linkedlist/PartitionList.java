package io.github.leetcode.linkedlist;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode temp1 = less;
        ListNode more = new ListNode(0);
        ListNode temp2 = more;

        while (head != null) {
            if (head.val >= x) {
                more.next = head;
                more = more.next;
            } else {
                less.next = head;
                less = less.next;
            }
            head = head.next;
        }

        more.next = null;
        less.next = temp2.next;
        return temp1.next;
    }

}
