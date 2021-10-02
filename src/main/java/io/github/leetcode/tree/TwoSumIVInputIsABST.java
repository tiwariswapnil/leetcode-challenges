package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIVInputIsABST {

    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return getNodeValues(root, k, set);
    }

    public boolean getNodeValues(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return getNodeValues(root.left, k, set) || getNodeValues(root.right, k, set);

    }

}
