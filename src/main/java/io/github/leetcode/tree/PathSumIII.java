package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return getPaths(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    public int getPaths(TreeNode root, int targetSum) {
        if (root == null) return 0;

        return (root.val == targetSum ? 1 : 0) +
                getPaths(root.left, targetSum - root.val) + getPaths(root.right, targetSum - root.val);
    }

}
