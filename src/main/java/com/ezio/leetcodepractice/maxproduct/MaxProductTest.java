package com.ezio.leetcodepractice.maxproduct;

/**
 * Here be dragons
 * Created by haotian on 2018/7/24 下午8:59
 */

public class MaxProductTest {

    public static void main(String[] args) {

        //float[] data = new float[] {1F, -2F, 3F, 10F, -4F, 7F, 2F, -5F, -19F, 3F, 10F, -4F, 7F, 2F, 8F, -100F, 1F};
        float[] data = new float[] {3F, 10F, -4F, 7F, 2F, 8F, 0F,-100F, 1F};
        MaxProductProblem problem = new MaxProductProblem(data);

        System.err.println("----------------------");
        System.err.println("最长连续最大和 " + problem.getMaxSum());
        System.err.println("最长连续最大和的子序列 " + problem.getMaxSumData());
        System.err.println("----------------------");
    }
}
