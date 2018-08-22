package com.ezio.leetcodepractice.invertTree;

/**
 * Here be dragons
 * Created by haotian on 2018/8/21 下午9:54
 */
public class InvertTreeTest {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(4);
        treeNode.setLeft(new TreeNode(2));
        treeNode.getLeft().setLeft(new TreeNode(1));
        treeNode.getLeft().setRight(new TreeNode(3));
        treeNode.setRight(new TreeNode(7));
        treeNode.getRight().setLeft(new TreeNode(6));
        treeNode.getRight().setRight(new TreeNode(9));
        System.err.println(treeNode);
        InvertTreeProblem problem = new InvertTreeProblem(treeNode);
        System.err.println(problem.getTreeNode());
    }
}
