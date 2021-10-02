package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        Map<TreeNode, Integer> m = new HashMap<TreeNode, Integer>();
        m.put(root, 1);

        int curW, maxW = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int start = 0, end = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (i == 0) start = m.get(node);
                if (i == size - 1) end = m.get(node);

                if (node.left != null) {
                    m.put(node.left, m.get(node) * 2);
                    q.add(node.left);
                }

                if (node.right != null) {
                    m.put(node.right, m.get(node) * 2 + 1);
                    q.add(node.right);
                }
            }

            curW = end - start + 1;
            maxW = Math.max(maxW, curW);
        }
        return maxW;
    }
}
