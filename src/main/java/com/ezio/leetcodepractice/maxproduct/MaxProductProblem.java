package com.ezio.leetcodepractice.maxproduct;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import lombok.Data;
import org.apache.commons.lang3.tuple.Pair;

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
        List<Pair<Float, Pair<Integer, Integer>>> tempMaxList = Lists.newArrayList();
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            tempSum += data[i];
            if (tempSum >= data[i]) {
            } else {
                start = i;
                tempSum = data[i];
            }
            maxSum = tempSum;
            tempMaxList.add(Pair.of(maxSum, Pair.of(start, i)));
        }
        maxSum = tempMaxList.stream().map(Pair::getLeft).max(Float::compare).get();
        AtomicInteger tempStart = new AtomicInteger();
        AtomicInteger tempEnd = new AtomicInteger();


        tempMaxList.stream().filter(e -> e.getLeft() == maxSum).collect(Collectors.toList())
            .forEach(e -> {
                if (e.getRight().getRight() - e.getRight().getLeft() > tempEnd.get() - tempStart.get()) {
                    tempStart.set(e.getRight().getLeft());
                    tempEnd.set(e.getRight().getRight());
                }
            });

        for (int i = tempStart.get(); i < tempEnd.get(); i++) {
            maxSumData.add(data[i]);
        }

    }
}
