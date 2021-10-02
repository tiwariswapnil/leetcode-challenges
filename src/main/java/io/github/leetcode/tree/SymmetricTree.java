package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricUtil(root.left, root.right);
    }

    public boolean isSymmetricUtil(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        } else if (leftNode == null || rightNode == null) {
            return false;
        }

        return (leftNode.val == rightNode.val) && isSymmetricUtil(leftNode.left, rightNode.right) && isSymmetricUtil(leftNode.right, rightNode.left);

    }

}
