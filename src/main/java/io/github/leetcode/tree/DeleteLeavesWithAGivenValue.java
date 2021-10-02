package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class DeleteLeavesWithAGivenValue {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        removeLeafNodes(root.left, target);
        removeLeafNodes(root.right, target);

        if (root.left != null && isTargetLeaf(root.left, target)) {
            root.left = null;
        }

        if (root.right != null && isTargetLeaf(root.right, target)) {
            root.right = null;
        }

        if (isTargetLeaf(root, target)) {
            root = null;
        }

        return root;
    }

    public boolean isTargetLeaf(TreeNode node, int target) {
        return (node.left == null && node.right == null && node.val == target);
    }

}
