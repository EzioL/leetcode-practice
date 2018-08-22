package com.ezio.leetcodepractice.minDiffInBST;

import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/8/21 下午9:58
 */
@Data
public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}
