package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;

public class FindModeInBinarySearchTree {

    Integer prev = null;
    int max = 0;
    int count = 1;

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[]{};

        ArrayList<Integer> arr = new ArrayList<>();
        travelTree(root, arr);

        int[] temp = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            temp[i] = arr.get(i);
        }
        return temp;
    }

    public void travelTree(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;

        travelTree(root.left, arr);

        if (prev != null) {
            if (prev == root.val) count++;
            else count = 1;
        }

        if (count > max) {
            arr.clear();
            arr.add(root.val);
            max = count;
        } else if (count == max) {
            arr.add(root.val);
        }

        prev = root.val;
        travelTree(root.right, arr);

    }

}
