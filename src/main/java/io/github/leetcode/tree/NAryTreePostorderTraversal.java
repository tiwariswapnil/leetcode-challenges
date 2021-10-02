package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.Node;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {
    public List<Integer> postorder(Node root) {
        List<Integer> vals = new ArrayList<>();
        getPostorderTraversal(root, vals);
        return vals;
    }

    public void getPostorderTraversal(Node node, List<Integer> vals) {
        if (node == null) return;
        for (Node child : node.children) {
            getPostorderTraversal(child, vals);
        }
        vals.add(node.val);
    }
}
