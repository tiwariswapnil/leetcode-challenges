package io.github.leetcode.tree;

import io.github.leetcode.tree.TreeNodes.TreeNode;

import java.util.ArrayList;

public class BinarySearchTreeIterator {

    ArrayList<Integer> list;

    public BinarySearchTreeIterator(TreeNode root) {
        this.list = new ArrayList<>();
        this.inorder(root);
    }

    public void inorder(TreeNode root){
        if(root != null) {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    public int next() {
        return list.remove(0);
    }

    public boolean hasNext() {
        return list.size() > 0;
    }

}
