package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class FindElementsInAContaminatedBinaryTree {

    Set<Integer> set = new HashSet<>();

    public void FindElements(TreeNode root) {
        if (root == null) return;
        root.val = 0;
        set.add(0);
        updateNodes(root);
    }

    public void updateNodes(TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            int x = (2 * root.val) + 1;
            root.left.val = x;
            set.add(x);
        }

        if (root.right != null) {
            int y = (2 * root.val) + 2;
            root.right.val = y;
            set.add(y);
        }

        updateNodes(root.left);
        updateNodes(root.right);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

}
