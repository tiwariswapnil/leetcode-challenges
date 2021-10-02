package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.val = lmax;
                root.left = deleteNode(root.left, lmax);
                return root;
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;
    }

    public int max(TreeNode root) {
        if (root.right != null)
            return max(root.right);
        else
            return root.val;
    }

}
