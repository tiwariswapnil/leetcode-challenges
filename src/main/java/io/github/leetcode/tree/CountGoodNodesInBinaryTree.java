package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class CountGoodNodesInBinaryTree {

    int count = 0;

    public int goodNodes(TreeNode root) {
        countNodes(root, root.val);
        return count;
    }

    public void countNodes(TreeNode root, int maxValue) {
        if(root == null) return;

        if(root.val >= maxValue) {
            count++;
            maxValue = root.val;
        }

        countNodes(root.left, maxValue);
        countNodes(root.right, maxValue);
    }

}
