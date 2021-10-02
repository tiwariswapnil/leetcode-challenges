package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class BalancedBinaryTree {

    int maxDiff = 0;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        getMaxDiff(root);
        return maxDiff < 2;
    }

    public int getMaxDiff(TreeNode root) {
        if (root == null) return 0;

        int lh = getMaxDiff(root.left);
        int rh = getMaxDiff(root.right);
        maxDiff = Math.max(maxDiff, Math.abs(lh - rh));
        return Math.max(lh, rh) + 1;
    }

}
