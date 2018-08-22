package com.ezio.leetcodepractice.invertTree;

import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/8/21 下午9:56
 */
@Data
public class InvertTreeProblem {

    private TreeNode treeNode;

    public InvertTreeProblem(TreeNode treeNode) {
        this.treeNode = solve(treeNode);
    }

    private TreeNode solve(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.getLeft() != null) {
            solve(root.getLeft());
        }
        if (root.getRight() != null) {
            solve(root.getRight());
        }
        TreeNode temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);
        return root;
    }
}
