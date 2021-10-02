package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;
        int max = Integer.MIN_VALUE;
        int left = 0, right = 0;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                left = i - 1;
                max = nums[i];
                right = i + 1;
            }
        }

        TreeNode node = new TreeNode(max);
        node.left = helper(nums, start, left);
        node.right = helper(nums, right, end);
        return node;
    }

}
