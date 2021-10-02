package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class UnivaluedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        boolean left = (root.left == null ||
                (root.val == root.left.val && isUnivalTree(root.left)));
        boolean right = (root.right == null ||
                (root.val == root.right.val && isUnivalTree(root.right)));

        return left && right;
    }

}
