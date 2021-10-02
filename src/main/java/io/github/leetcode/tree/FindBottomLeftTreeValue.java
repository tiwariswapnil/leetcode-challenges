package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindBottomLeftTreeValue {

//    Solution 1
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) return 0;
        int bottomLeftValue = 0;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode temp = q.poll();
                if (temp.right != null) q.add(temp.right);
                if (temp.left != null) q.add(temp.left);
                bottomLeftValue = temp.val;
            }
        }

        return bottomLeftValue;
    }

//     Solution 2
//    int depth = 0, ans;
//
//    public int findBottomLeftValue(TreeNode root) {
//        ans = root.val;
//        getValue(root, 0);
//        return ans;
//    }
//
//    public void getValue(TreeNode root, int level){
//        if(root == null) return;
//
//        if(level > depth){
//            ans = root.val;
//            depth++;
//        }
//
//        getValue(root.left, level + 1);
//        getValue(root.right, level + 1);
//    }
}
