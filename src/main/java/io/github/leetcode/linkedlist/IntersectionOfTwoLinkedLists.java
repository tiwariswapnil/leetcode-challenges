package io.github.leetcode.linkedlist;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        ListNode n1 = headA;

        while (n1 != null) {
            n1 = n1.next;
            len1++;
        }

        int len2 = 0;
        ListNode n2 = headB;

        while (n2 != null) {
            n2 = n2.next;
            len2++;
        }

        int i = 0;
        n1 = headA;
        n2 = headB;

        while (Math.abs(len1 - len2) > 0) {
            if (len1 > len2) {
                n1 = n1.next;
                len1--;
            } else {
                n2 = n2.next;
                len2--;
            }
        }

        while (n1 != n2) {
            n1 = n1.next;
            n2 = n2.next;
        }

        return n1;
    }

}
