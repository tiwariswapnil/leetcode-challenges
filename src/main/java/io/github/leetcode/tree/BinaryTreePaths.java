package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        getPaths(root, "" + root.val);
        return list;
    }

    public void getPaths(TreeNode root, String path) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        if (root.left != null) getPaths(root.left, path + "->" + root.left.val);
        if (root.right != null) getPaths(root.right, path + "->" + root.right.val);
    }

}
