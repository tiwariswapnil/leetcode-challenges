package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversalUtil(root, list);
        return list;
    }

    public void postorderTraversalUtil(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorderTraversalUtil(root.left, list);
        postorderTraversalUtil(root.right, list);
        list.add(root.val);
    }

}
