package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class EvenOddTree {

    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 0;

        while (q.size() > 0) {
            int size = q.size();
            int prev = 0;

            while (size-- > 0) {
                TreeNode temp = q.poll();
                int val = temp.val;

                if (level % 2 == 0) {

                    if (temp.val % 2 == 0) return false;
                    if (prev != 0 && prev >= val) return false;

                } else {

                    if (temp.val % 2 != 0) return false;
                    if (prev != 0 && prev <= val) return false;

                }

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
                prev = val;

            }

            level++;
        }

        return true;
    }

}
