package io.github.leetcode.tree;

public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int[] cn = new int[n + 1];
        cn[0] = 1;
        cn[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                cn[i] += cn[j] * cn[i - j - 1];
            }
        }

        return cn[n];
    }

}
