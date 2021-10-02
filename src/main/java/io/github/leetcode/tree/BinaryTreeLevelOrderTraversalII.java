package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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

        Collections.reverse(levelList);
        return levelList;
    }

}
