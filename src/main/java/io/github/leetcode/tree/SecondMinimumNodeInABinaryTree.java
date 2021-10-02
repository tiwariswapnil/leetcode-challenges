package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class SecondMinimumNodeInABinaryTree {

    int min;
    int secondMin = Integer.MAX_VALUE;
    boolean flag = false;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        findSecondMinimumValueUtil(root);
        if (flag) {
            return secondMin;
        }
        return -1;

    }

    public void findSecondMinimumValueUtil(TreeNode root) {
        if (root == null) return;

        if (root.val == min) {
            findSecondMinimumValueUtil(root.left);
            findSecondMinimumValueUtil(root.right);
        } else {
            secondMin = Math.min(secondMin, root.val);
            flag = true;
        }
    }

}
