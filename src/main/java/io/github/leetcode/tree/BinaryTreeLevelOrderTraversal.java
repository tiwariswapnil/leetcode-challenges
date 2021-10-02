package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levelList = new ArrayList<>();

        if (root == null) return levelList;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();

            while (size-- > 0) {
                TreeNode n = q.poll();

                if (n.left != null) {
                    q.add(n.left);
                }

                if (n.right != null) {
                    q.add(n.right);
                }

                temp.add(n.val);
            }

            levelList.add(temp);
        }

        return levelList;
    }

}
