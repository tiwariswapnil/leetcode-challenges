package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        getPathSumList(root, targetSum, new ArrayList<>(), res);
        return res;
    }

    public void getPathSumList(TreeNode root, int targetSum, List<Integer> list, List<List<Integer>> res) {
        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            res.add(new ArrayList<Integer>(list));
        } else {
            getPathSumList(root.left, targetSum - root.val, list, res);
            getPathSumList(root.right, targetSum - root.val, list, res);
        }
        list.remove(list.size() - 1);
    }

}
