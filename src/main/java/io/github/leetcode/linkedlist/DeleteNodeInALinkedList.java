package io.github.leetcode.linkedlist;

public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        ListNode n1 = node;

        while (node.next != null) {
            n1 = node;
            node.val = node.next.val;
            node = node.next;
        }

        n1.next = null;
    }

}
