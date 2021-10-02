package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int l = 1 + maxDepth(root.left);
        int r = 1 + maxDepth(root.right);

        return l > r ? l : r;
    }

}
