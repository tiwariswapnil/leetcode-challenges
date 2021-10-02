package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.Node;

public class MaximumDepthOfNAryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            return 1;
        }

        int max = 0;

        for (Node child : root.children) {
            int h = 1 + maxDepth(child);
            max = Math.max(h, max);
        }

        return max;
    }

}
