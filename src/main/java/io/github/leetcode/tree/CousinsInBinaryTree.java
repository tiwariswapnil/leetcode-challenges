package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class CousinsInBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {

        return level(root, x, 1) == level(root, y, 1) && !isSibling(root, x, y);

    }

    public int level(TreeNode root, int x, int level) {

        if (root == null) {
            return -1;
        }
        if (root.val == x) {
            return level;
        }

        int left = level(root.left, x, level + 1);
        if (left != -1) return left;

        return level(root.right, x, level + 1);

    }

    public boolean isSibling(TreeNode root, int x, int y) {

        if (root == null) return false;

        return (root.left != null && root.right != null && root.left.val == x && root.right.val == y) ||
                (root.left != null && root.right != null && root.left.val == y && root.right.val == x) ||
                isSibling(root.left, x, y) ||
                isSibling(root.right, x, y);
    }

}
