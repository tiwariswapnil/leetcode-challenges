package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {

    public int minDiffInBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        getInorderNodes(root, vals);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < vals.size() - 1; i++) {
            minDiff = Math.min(minDiff, vals.get(i + 1) - vals.get(i));
        }
        return minDiff;
    }

    public void getInorderNodes(TreeNode root, List<Integer> vals) {

        if (root == null) return;
        getInorderNodes(root.left, vals);
        vals.add(root.val);
        getInorderNodes(root.right, vals);

    }

}
