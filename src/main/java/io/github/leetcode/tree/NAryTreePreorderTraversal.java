package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.Node;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> vals = new ArrayList<>();
        getPreorderTraversal(root, vals);
        return vals;
    }

    public void getPreorderTraversal(Node node, List<Integer> vals) {
        if (node == null) return;
        vals.add(node.val);
        for (Node child : node.children) {
            getPreorderTraversal(child, vals);
        }
    }
}
