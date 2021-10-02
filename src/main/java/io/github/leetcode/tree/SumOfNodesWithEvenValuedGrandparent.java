package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class SumOfNodesWithEvenValuedGrandparent {

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;

        if (root.val % 2 == 0) {
            sum += getSum(root, 0);
        }

        return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }

    public int getSum(TreeNode head, int depth) {

        if (head == null) return 0;
        if (depth == 2) return head.val;

        return getSum(head.left, depth + 1) + getSum(head.right, depth + 1);
    }

}
