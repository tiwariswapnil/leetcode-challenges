package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class DiameterOfBinaryTree {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;

        int lh = helper(root.left);
        int rh = helper(root.right);

        if (max < lh + rh) {
            max = lh + rh;
        }

        return Math.max(lh, rh) + 1;
    }

}
