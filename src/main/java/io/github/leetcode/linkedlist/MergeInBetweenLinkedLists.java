package io.github.leetcode.linkedlist;

public class MergeInBetweenLinkedLists {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode temp = list1;
        while (a-- > 1) {
            list1 = list1.next;
        }
        while (b-- > -1) {
            temp = temp.next;
        }

        list1.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = temp;

        return head;
    }
}
