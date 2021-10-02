package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        getInorder(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        getInorder(root2, list2);

        return mergeLists(list1, list2);
    }

    public List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        list2.addAll(list1);
        Collections.sort(list2);
        return list2;
    }

    public void getInorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        getInorder(root.left, list);
        list.add(root.val);
        getInorder(root.right, list);
    }

}
