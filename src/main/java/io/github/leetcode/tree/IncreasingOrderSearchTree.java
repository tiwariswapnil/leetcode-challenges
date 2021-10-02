package io.github.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> val = new ArrayList<>();
        inOrder(root, val);
        TreeNode head = new TreeNode(0);
        TreeNode cur = head;

        for (int v : val) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }

        return head.right;
    }

    public void inOrder(TreeNode node, List<Integer> val) {
        if (node == null) return;
        inOrder(node.left, val);
        val.add(node.val);
        inOrder(node.right, val);
    }

}
