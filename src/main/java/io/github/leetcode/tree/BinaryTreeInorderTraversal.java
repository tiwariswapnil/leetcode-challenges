package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorderTraversalUtil(root, l);
        return l;
    }

    public void inorderTraversalUtil(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        inorderTraversalUtil(root.left, l);
        l.add(root.val);
        inorderTraversalUtil(root.right, l);
    }

}
