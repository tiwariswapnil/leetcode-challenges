package io.github.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedListII {

//    Recursive

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        if (head.next != null && head.next.val == head.val) {
            while (head.next != null && head.next.val == head.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        }

        head.next = deleteDuplicates(head.next);
        return head;
    }

//    Iterative
//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode sentinal = new ListNode(0, head);
//        ListNode pred = sentinal;
//
//        while (head != null) {
//            if (head.next != null && head.val == head.next.val) {
//                while (head.next != null && head.val == head.next.val) {
//                    head = head.next;
//                }
//                pred.next = head.next;
//            } else {
//                pred = pred.next;
//            }
//
//            head = head.next;
//        }
//
//        return sentinal.next;
//    }
}
