package com.ezio.leetcodepractice.maxproduct;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/7/27 下午4:49
 */
@Data
public class MaxProductProblem {

    private float maxSum = 0F;

    private float maxProduct;

    private float[] data;

    private List<Float> maxSumData = Lists.newArrayList();

    public MaxProductProblem(float[] data) {
        this.data = data;
        solveMaxSum();
        solveMaxProduct();
    }

    private void solveMaxProduct() {

    }

    private void solveMaxSum() {
        float tempSum = 0F;
        List<Float> tempMaxList = Lists.newArrayList();
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            tempSum += data[i];
            if (tempSum >= data[i]) {
            } else {
                start = i;
                tempSum = data[i];
            }
            maxSum = tempSum;
            tempMaxList.add(maxSum);
        }
        maxSum = tempMaxList.stream().max(Float::compare).get();
        tempSum = 0F;
        for (int i = start; i < data.length; i++) {
            tempSum = tempSum + data[i];
            if (tempSum == maxSum) {
                break;
            }
            maxSumData.add(data[i]);
        }
    }
}
