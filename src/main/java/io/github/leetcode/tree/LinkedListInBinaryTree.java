package io.github.leetcode.tree;

import io.github.leetcode.linkedlist.ListNode;
import io.github.leetcode.tree.TreeNodes.TreeNode;

public class LinkedListInBinaryTree {

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        return findSubPath(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean findSubPath(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;

        return (head.val == root.val) && (findSubPath(head.next, root.left) || findSubPath(head.next, root.right));
    }

}
