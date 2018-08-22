package com.ezio.leetcodepractice.minDiffInBST;

import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/8/21 下午10:26
 */
@Data
public class MinDiffInBSTProblem {

    private TreeNode treeNode;
    private int minDiff;

    public MinDiffInBSTProblem(TreeNode treeNode) {
        this.treeNode = treeNode;

        this.minDiff = solve(treeNode);
    }

    int res = 10000, pre = -1;

    private int solve(TreeNode root) {
        if (root.getLeft() != null) {
            solve(root.getLeft());
        }
        if (pre >= 0) {
            res = Math.min(res, root.getValue() - pre);
        }
        pre = root.getValue();

        if (root.getRight() != null) {
            solve(root.getRight());
        }

        System.err.println("pre-->" + pre);
        System.err.println("res-->" + res);
        return res;
    }
}
