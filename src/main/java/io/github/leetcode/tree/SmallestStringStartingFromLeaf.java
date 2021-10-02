package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

public class SmallestStringStartingFromLeaf {

    String curSmall = "";

    public String smallestFromLeaf(TreeNode root) {
        getSmallestString(root, "");
        return curSmall;
    }

    public void getSmallestString(TreeNode root, String pre) {
        char c = (char) ('a' + root.val);
        String cur = c + pre;

        if (root.left == null && root.right == null) {
            if (curSmall.length() == 0) curSmall = cur;
            else if (cur.compareTo(curSmall) < 0) curSmall = cur;
            return;
        }
        if (root.left != null) getSmallestString(root.left, cur);
        if (root.right != null) getSmallestString(root.right, cur);
    }

}
