package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class DeepestLeavesSum {

    public int deepestLeavesSum(TreeNode root) {
        int depth = getDepth(root);
        return getDepthSum(root, 1, depth);
    }

    public int getDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public int getDepthSum(TreeNode root, int level, int depth) {
        if (root == null) return 0;

        if (level == depth) {
            return root.val;
        }

        return getDepthSum(root.left, level + 1, depth) + getDepthSum(root.right, level + 1, depth);
    }

}
