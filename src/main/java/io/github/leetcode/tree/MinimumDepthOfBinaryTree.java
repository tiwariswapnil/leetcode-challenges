package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class MinimumDepthOfBinaryTree {

    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        findMinDepth(root, 0);
        return minDepth == Integer.MAX_VALUE ? 0 : minDepth;
    }

    public void findMinDepth(TreeNode root, int count) {
        if (root == null) return;
        count++;

        if (root.left == null && root.right == null) {
            if (count < minDepth) {
                minDepth = count;
            }
        }

        findMinDepth(root.left, count);
        findMinDepth(root.right, count);
    }

}
