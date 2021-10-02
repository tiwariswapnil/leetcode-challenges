package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder leaf1 = new StringBuilder();
        StringBuilder leaf2 = new StringBuilder();

        getLeafNodes(root1, leaf1);
        getLeafNodes(root2, leaf2);

        return leaf1.toString().equals(leaf2.toString());
    }

    public void getLeafNodes(TreeNode node, StringBuilder s) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            s.append(node.val);
            s.append(" ");
        }

        getLeafNodes(node.left, s);
        getLeafNodes(node.right, s);
    }

}
