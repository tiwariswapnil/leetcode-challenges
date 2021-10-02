package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {

    List<String> numbers = new ArrayList<>();

    public int sumNumbers(TreeNode root) {

        getNumbers(root, "");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public void getNumbers(TreeNode root, String num) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            numbers.add(num + root.val);
            return;
        }

        getNumbers(root.left, num + root.val);
        getNumbers(root.right, num + root.val);
    }

}
