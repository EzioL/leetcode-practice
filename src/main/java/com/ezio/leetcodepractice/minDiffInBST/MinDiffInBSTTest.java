package com.ezio.leetcodepractice.minDiffInBST;

/**
 * Here be dragons
 * Created by haotian on 2018/8/21 下午10:23
 */
public class MinDiffInBSTTest {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.setLeft(new TreeNode(2));
        treeNode.getLeft().setLeft(new TreeNode(1));
        treeNode.getLeft().setRight(new TreeNode(3));
        treeNode.setRight(new TreeNode(6));



        MinDiffInBSTProblem problem = new MinDiffInBSTProblem(treeNode);
        System.err.println(problem);

    }
}
