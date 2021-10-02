package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> rightSideViewList = new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();

            while (size > 1) {
                TreeNode temp = q.poll();
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
                size--;
            }

            TreeNode temp = q.poll();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            rightSideViewList.add(temp.val);
        }

        return rightSideViewList;
    }

}
