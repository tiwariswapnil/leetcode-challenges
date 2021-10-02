package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRow {

    List<Integer> list = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        getMaxValues(root, 0);
        return list;
    }

    public void getMaxValues(TreeNode root, int level){
        if(root == null) return;

        if(list.size() <= level) list.add(root.val);
        else {
            int max = Math.max(list.get(level), root.val);
            list.set(level, max);
        }

        getMaxValues(root.left, level + 1);
        getMaxValues(root.right, level + 1);
    }

}
