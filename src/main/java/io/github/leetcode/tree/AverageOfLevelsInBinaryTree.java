package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();
            int len = size;
            double res = 0;

            while (size-- > 0) {
                TreeNode node = q.poll();
                res = res + node.val;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            list.add(res / len);
        }

        return list;
    }

}
