package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> levelOrderList = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        int level = 0;
        while (q.size() > 0) {
            List<Integer> list = new ArrayList<>();
            level++;
            int size = q.size();

            while (size-- > 0) {
                TreeNode temp = q.poll();
                list.add(temp.val);

                if (temp.left != null) q.add(temp.left);

                if (temp.right != null) q.add(temp.right);
            }

            if (level % 2 == 0) {
                Collections.reverse(list);
            }

            levelOrderList.add(list);
        }

        return levelOrderList;
    }

}
