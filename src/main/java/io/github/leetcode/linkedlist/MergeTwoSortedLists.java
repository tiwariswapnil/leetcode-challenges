package io.github.leetcode.linkedlist;

public class MergeTwoSortedLists {

    //    Recursive solution
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

//        Iterative
//
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(-1);
//        ListNode temp = dummy;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                temp.next = l1;
//                l1 = l1.next;
//            } else {
//                temp.next = l2;
//                l2 = l2.next;
//            }
//            temp = temp.next;
//        }
//
//        temp.next = l1 == null ? l2 : l1;
//
//        return dummy.next;
//    }

}
